package ���߳�.�߳�ͬ��;

/**
 * ͬ�������_�̳�Thread
 * 1.ͬ�����������Ҫ����һ�����������
 * 2.����Run()�������к���ͬ������顿�ķ���
 * 
 * @author SOLLAN
 *
 */
public class CodeBlock extends Thread {
	private static Object lock = new Object();
	private static int count = 100;
	private static int i = 1;

	public CodeBlock(String name) {
		super(name);
	}

	public void run() {
		tack();
	}

	public void tack() {
		synchronized(lock) {
			if (i < count) {
				System.out.println(Thread.currentThread().getName() + "��" + i + "��Ʊ");
				i++;
		}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				Thread.sleep(300);
			}
			CodeBlock tack = new CodeBlock("��" + i + "�˳�Ʊ��\t");
			System.out.println("��" + i + "��׼����Ʊ��");
			tack.start();
			Thread.sleep(1);

		}
	}
}
