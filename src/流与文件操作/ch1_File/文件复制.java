package �����ļ�����.ch1_File;

import java.io.*;


public class �ļ����� {
	
	
	//���롾�ļ�Դ��ַ���������Ƶ��ĵ�ַ��
	public static void copyFileOld(String src, String dest) {
		InputStream is = null;
		OutputStream os = null;
		long total=0;
		long startTime=System.currentTimeMillis();
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			int ch;
			//ÿ��ȡһ���ֽھʹ洢һ���ֽ�
			while((ch=is.read())!=-1) {
				//���㹲�ж��ٸ��ֽ�
				total++;
				os.write(ch);
				System.out.printf("��ǰ�Ѹ��Ƶ��ֽ�����%d\r",total);
			}
			long endTime=System.currentTimeMillis();
			System.out.printf("��������ʱ�䣺"+(endTime-startTime)+"ms");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		/**
		 * һ�ζ���һ���ֽ�
		 * �ٶ�ʮ�ֻ���
		 *
		 */
	}
	
	//����byte[]���������������ٶ�
	public static void copyFileNew(String src, String dest) {
		InputStream is = null;
		OutputStream os = null;
		long total=0;
		long startTime=System.currentTimeMillis();
		
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			//�ƺ�10w�������ܡ����š�
			byte[] buff=new byte[100000];
			int cnt=0;
			//��ÿ�δ浽���������ֽ���������,ÿ�ζ�ȡ10w���ֽ�
			while((cnt=is.read(buff))>0) {
				total+=cnt;
				//�� byte ����д��������
				os.write(buff, 0, cnt);
				System.out.printf("��ǰ�Ѹ��Ƶ��ֽ�����%d		\r",total);
			}
			long endTime=System.currentTimeMillis();
			System.out.printf("��������ʱ�䣺"+(endTime-startTime)+"ms");
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	
	//ʹ��Buffer����װ
	public static void copyFileBuffer(String src, String dest) {
		InputStream is = null;
		OutputStream os = null;
		long total=0;
		long startTime=System.currentTimeMillis();
		
		try {
			//������buffer��װ��ʹЧ���ٴ�������
			is=new BufferedInputStream(new FileInputStream(src));
			os = new BufferedOutputStream(new FileOutputStream(dest));
			//ʹ����ǿ���ƺ�byte[]���������õ�Խ��Խ��
			byte[] buff=new byte[1000000];
			int cnt=0;
			//��ÿ�δ浽���������ֽ���������,ÿ�ζ�ȡ100w���ֽ�
			while((cnt=is.read(buff))>0) {
				total+=cnt;
				//�� byte ����д��������
				os.write(buff, 0, cnt);
				System.out.printf("��ǰ�Ѹ��Ƶ��ֽ�����%d		\r",total);
			}
			long endTime=System.currentTimeMillis();
			System.out.printf("��������ʱ�䣺"+(endTime-startTime)+"ms");
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		/**
		 * ����ԭ��
		 * BufferedInputStream�����л���������Ϊ8192�ֽڣ�
		 * ��byte[4000],read()����ʹ��ʱ����Դ�ļ���ȡ8192�ֽڵ��Լ��Ļ��������ٽ����е�4000���ֽڸ���byte[],����������¼���
		 * read()�ٴδ�Դ�ļ��ڵ��ȡ8192���ֽڣ��Դ����ơ�
		 * 
		 * ÿ��byte[]��ȡ���ֽ����ݣ���ͨ��write()д���������������������Ϊ8192�ֽڣ�3�κ󻺳����������㿪ʼд���ļ��ڵ㣬�Դ����ơ�
		 * 
		 */
	}
	
	public static void main(String[] args) {
//		copyFileOld("D:\\JAVA�������\\File\\����.rar", "D:\\JAVA�������\\File\\myfile\\����.rar");
//		copyFileNew("D:\\JAVA�������\\File\\MP4.mp4", "E:\\aa\\̷��.mp4");
		copyFileBuffer("D:\\JAVA�������\\File\\����.rar", "D:\\JAVA�������\\File\\myfile\\����.rar");
	}

}











