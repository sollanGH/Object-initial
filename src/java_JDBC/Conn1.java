package java_JDBC;

import java.sql.*;

public class Conn1 { // ���������ݿ⡿
	Connection con;// <����>�ӿڣ��������ض������ݿ⽨������

	public Connection getConnection() {// ��������ֵΪconnection�ķ���
		try {
			Class.forName("com.mysql.jdbc.Driver");// �������ݿ�������
			System.out.println("���ݿ��������سɹ���");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// �������ݿ� ��������Ϊ�����ݿ��ַ������ �û��� ����
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "520ycsqlbegen");
			System.out.println("���ݿ����ӳɹ���");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;// ���շ���Ҫ�󷵻�Connection��������
	}

	public static void main(String[] args) {
		Conn1 c = new Conn1();
		c.getConnection();

	}

}
/*
 * java.sql���е�Connection�ӿڣ�ͨ��DriverManager��ľ�̬����getConnection()�������Ӷ���
 * Class����java.lang���е�һ���࣬ͨ������ľ�̬����forName()�ɼ���MySQL��jdbc����
 */
