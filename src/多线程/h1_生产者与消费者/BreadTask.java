package 多线程.h1_生产者与消费者;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BreadTask implements Runnable {

	
	private static final int PRODUCE = 1;
	private static final int SELL = 2;
	
	private ReentrantLock lock = new ReentrantLock(); //{ps} 同步锁
	private int LIMIT;          //{ps} 上限值
	private int count;          //{ps} 现有面包数
	
	//{ps} 定义两个锁条件
	private Condition produceCondition = lock.newCondition();  //用来唤醒王师傅
	private Condition sellCondition = lock.newCondition();     //用来唤醒消费者 "们"
	
	//{ps} 定义状态变量
	private int status = PRODUCE; //{默认为: 生产}
	
	public BreadTask( int limit ){
		this.LIMIT = limit;   //{ps} 设定仓库的容量
	}
	
	@Override
	public void run() {
		//{1} 拿到线程名: 老王, A, B...
		String thName = Thread.currentThread().getName();
		//{2} 判断一下: 分为两类线程: 生产 / 消费
		if( thName.equals("老王") ){
			while( true ){
				produceTask( thName );
			} 
		}else{
			while( true ){
				sellTask( thName );
				delay(20);
			} 
		}
	}
	
	//{ps} 核心方法 -------------------------------------------
	private void produceTask(String thName){
		lock.lock();
		if( status==PRODUCE ){    //{ps} 绿灯亮了 ---> 我就去生产
			if( count==LIMIT ){   //{ps} 面包满了..
				//{ps} 切换 "指示灯" 状态
				status = SELL;
				//{ps} 唤醒所有的 "消费者"
				sellCondition.signalAll();
			}else{      //{ps} 面包未满..
				//{ps} 继续生产
				count ++;
				printf( "{%s} 生产了 %d 个面包。\n", thName, count );
				
			}
		}else{
			//{ps} 绿灯不亮  ---> 我就去休息
			try {
				printf("{%s} 不做面包, 去休息了。。\n", thName);
				produceCondition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lock.unlock();
	}
	
	private void sellTask(String thName){
		lock.lock();
		if( status==SELL ){        //{ps} 蓝色指示灯亮 ---> 我就去消费
			if( count > 0 ){       //{ps} 如果还有面包
				//delay(500);
				count --;   //{ps} 继续消费
				printf( "{%s} 消费了 1 个面包, 现在面包数: %d。\n", thName, count );
			}else{      //{ps} 面包 == 0
				//{ps} 切换 "指示灯" 状态  --> 绿灯
				status = PRODUCE;
				//{ps} 唤醒 "生产者" (老王)
				produceCondition.signal();
			}
		}else{
			//{ps} 蓝色指示灯不亮  ---> 消费者就去休息
			try {
				printf("{%s} 买不到面包, 先等待。。\n", thName);
				sellCondition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lock.unlock();
	}
	
	//{ps} 用来延时 ------------------------------------------
	private void delay(int ms){
		try { Thread.sleep( ms ); }
		catch (InterruptedException e) { }
	}
	private void printf(String format,Object...args){
		System.out.printf(format,args);
	}
}
