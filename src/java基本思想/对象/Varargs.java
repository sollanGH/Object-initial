package java����˼��.����;

//���βγ��ȿɱ䷽����
public class Varargs {

	public static void outClassInfo(String className, String... studentNames) {
		// ����༶����
		System.out.println("�༶���ƣ�" + className);
		System.out.println("�༶��Ա����:");
		// studentNames���������鴦��
		for (String student : studentNames) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		// ����outClassInfo����
		outClassInfo("�����8��", "����", "����", "������", "�����");

	}

}
