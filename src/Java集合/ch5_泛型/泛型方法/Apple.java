package Java����.ch5_����.���ͷ���;

/**
 * �����Ȳ�ȷ���������С��β�����
 * �ܹ�����ѡ�񷽷����β����ͣ��������ط���
 */
public class Apple {
	
	//���͹��췽��
	public <K>Apple(K k){
		System.out.println("���췽��������˭��"+k);
	}
	
	//���ͷ���
	public <T> void fall(T t) {
		System.out.println("���ҵ�˭��:" + t);
	}

	public static void main(String[] args) {
		//��ͨ���ͷ���
		Apple apple = new Apple();
		//����Ρ������β�����
		apple.<String>fall("ţ��");
		//����Ρ�
		apple.<Integer>fall(484);
		
		//���͹��췽��
		Apple a=new <String>Apple("������");
	}
	
	
	
	
	//�޲ι��췽��
	public Apple() {
		
	}
}
