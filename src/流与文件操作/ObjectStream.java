package �����ļ�����;

import java.io.*;

     //�������״̬���ļ���
public class ObjectStream implements Serializable {// ����ӿ�û��Ҫʵ�ֵķ�������Ϊ��������������л�
	static ObjectStream object = new ObjectStream();

	/*-----------��-----��-----��-----��----------------------------------------*/

	private int width;
	private int height;

	public void setWidth(int w) {
		this.width = w;
	}

	public void setHeight(int h) {
		height = h;
	}

	public void setHW() {
		this.width = 20;
		this.height = 20;
	}

	public static void main(String[] args) {
		// ���������
		ObjectStream os = new ObjectStream();
		// �����Ա������ֵ
		os.setWidth(50);
		os.setHeight(70);

		try {
			// �����ļ������������״̬�Ķ����ļ���չ���Զ���
			FileOutputStream fs = new FileOutputStream("G:/JAVA�������/File/foo.txt");
			// ���������ļ�����������
			ObjectOutputStream oops = new ObjectOutputStream(fs);
			// ������д�������
			oops.writeObject(os);
			// �رն�����
			oops.close();
		} catch (IOException w) {
			w.printStackTrace();
		}

		/*--------��-----ȡ-----��-----��--------------------------------*/
		// ����Ա����ֵ�ı�
		os.setHW();

		try {
			// �ļ���������ȷ������ȡ�ļ�
			FileInputStream fi = new FileInputStream("G:/JAVA�������/File/foo.txt");
			// ���������������ļ�����������
			ObjectInputStream oips = new ObjectInputStream(fi);
			// ��ȡ�ļ��еĶ��󣬰��մ洢˳���ȡ����ȡ���������洢�����ᱨ��
			// ����ȡ���Ķ�����ʱ�洢��one��
			Object one = oips.readObject();
			// ���������һ���µĶ��󣬽�one�еĶ���ǿתΪ�������
			object = (ObjectStream) one;
			// �رն�����
			oips.close();
		} catch (ClassNotFoundException w) {
			w.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//��ӡ��ֵ�����Ǹı�֮ǰ����ֵ
		System.out.println(object.height);
		System.out.println(object.width);

	}
}
