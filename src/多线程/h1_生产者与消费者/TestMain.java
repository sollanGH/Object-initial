package ���߳�.h1_��������������;

public class TestMain {
	public static void main(String[] args) {

		BreadTask task = new BreadTask(20);
		Thread wang = new Thread(task, "����");

		Thread th1 = new Thread(task, "candy");
		Thread th2 = new Thread(task, "������");
		Thread th3 = new Thread(task, "Ϭ����");
		Thread th4 = new Thread(task, "������");

		wang.start();
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
