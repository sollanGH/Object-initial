package ����ת��;

public class B extends A {
	public B() {
		System.out.println("B���޲������췽��");
	}

	public B(int b) {
		System.out.println("B���в������췽��");
	}
	
/*...............................................................................................................*/
	
	public void aa(int a) {// ������A�е�aa��������
		System.out.println("B�е��в���aa����");
	}

	public void aa() {// ������A�е�aa��������
		System.out.println("B�е��޲���aa����");
	}

	public void bb() {
		System.out.println("B�е�bb����");
	}

	public void cc() {
		System.out.println("B�е�cc����");
	}
	public void out() {
		System.out.println("������B���out����");
	}
}
