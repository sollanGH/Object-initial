package swing�������;

import java.awt.Color;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.*;

public class TextArea {//�ı���

	public static void main(String[] args) {
		JFrame frame=new JFrame("�ı���");
		JTextArea area=new JTextArea("����һ���ı���",30,10);//�ı���ָ������������
		JScrollPane spanel=new JScrollPane(area);
		area.setBackground(Color.pink);
		frame.add(spanel);
		frame.setSize(600, 400);
		frame.setLocation(600, 300);
		frame.setVisible(true);
		

	}

}
/*
 * ���췽��:
 * public TextArea();//���ı���
 * public TextArea(int rowa,int columns);//ָ������������
 * public TextArea(String str,int r,int c);//ָ�����֡�����������
 * public TextArea(String str,int r,int c,int scrollbar);//ָ�����֡���������������������״̬
 * 
 * ���÷���:
 * public String getText();//�����ı����е�����
 * public void setText(String str);//�����ı����е�����
 * public void append(String str);//���ı�ĩ���������
 * 
 * public String getSelectedText();//�����ı�����ѡ�е�����
 * public int getSelectionStart();//�����ı�����ѡ�����ֵ���ʼλ��
 * public int get SelectioneEnd();//�����ı�����ѡ�����ֵ�ĩβλ��
 * public void insert(String str,int pos);//���ַ�����ӵ��ı���ָ��λ��
 * public void replaceRange(String str,int start,int end);//���ַ��������start��end֮����ı�
 * 
 * 
 * 
 * 
 * �¼���
 * TextEvent  TextListener�ӿ� ���ı����ݷ����ı�ʱ�����¼�
 * MouseEvent  MouseMotionListener�ӿ�
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/









