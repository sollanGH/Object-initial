package java����˼��.������.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

//�򵥵�ʱ���ʽ
public class SimpleDateFormatTest {

	public static void main(String[] args) {
		//��ȡ��ǰʱ��
		Date day=new Date();
		System.out.println(day);
		
		//�����Լ���ʱ���ʽ
		SimpleDateFormat gs1=new SimpleDateFormat("yyy��MM��dd�� HH:mm:ss E");
		//��ʱ�䴫���Լ������ĸ�ʽ��
		String time=gs1.format(day);
		System.out.println(time);
		
		SimpleDateFormat gs2=new SimpleDateFormat("yyy/MM/dd h:m:s a SS���� ����u");
		time =gs2.format(day);
		System.out.println(time);
		
		/*SimpleDateFormat gs3=new SimpleDateFormat("yyy-MM-dd h:m a ����u");
		time =gs3.format(day);
		System.out.println(time);*/
		
		
	}

	/**
	 * 	��ĸ   ���ڻ�ʱ��Ԫ��  ��ʾ  ʾ��  
		G  Era ��־��  Text  AD  
		y  ��  Year  1996; 96  
		M  ���е��·�  Month  July; Jul; 07  
		w  ���е�����  Number  27  
		W  �·��е�����  Number  2  
		D  ���е�����  Number  189  
		d  �·��е�����  Number  10  
		F  �·��е�����  Number  2  
		E  �����е�����  Text  Tuesday; Tue  
		a  Am/pm ���  Text  PM  
		H  һ���е�Сʱ����0-23��  Number  0  
		k  һ���е�Сʱ����1-24��  Number  24  
		K  am/pm �е�Сʱ����0-11��  Number  0  
		h  am/pm �е�Сʱ����1-12��  Number  12  
		m  Сʱ�еķ�����  Number  30  
		s  �����е�����  Number  55  
		S  ������  Number  978  
		z  ʱ��  General time zone  Pacific Standard Time; PST; GMT-08:00  
		Z  ʱ��  RFC 822 time zone  -0800  

	 */
}
