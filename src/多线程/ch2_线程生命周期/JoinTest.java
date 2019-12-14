package 多线程.ch2_线程生命周期;

/**
 *【线程合并】插入
 * th.join(); 等待该线程终止。
 * join(long millis) ;	等待该线程终止的时间最长为 millis 毫秒。
 * join(long millis, int nanos) 等待该线程终止的时间最长为 millis 毫秒 + nanos 纳秒。
 *
 */
public class JoinTest implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("学生做俯卧撑，第"+i+"个");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		JoinTest task=new JoinTest();
		Thread th=new Thread(task);
		System.out.println("老师叫学生做俯卧撑--->");
		th.start();
		
		try {
			//Main等待th线程终止
			th.join();
			System.out.println("老师罚完学生，走了---");
			
			//Main最多等待5000毫秒
			th.join(5000);
			System.out.println("老师等了5秒，有急事走了----");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
