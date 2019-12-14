package java_JDBC;

import java.sql.*;

public class Conn2 { // ���������ݿ⡿
	static Connection con;// <����>�ӿڣ��������ض������ݿ⽨������
	static Statement sql;// <����>�ӿڣ����Ѿ��������ӵĻ����������ݿⷢ��SQL���
	static ResultSet res;// <���>�ӿڣ�������ʱ������ݿ��ѯ��������õĽ����

	public Connection getConnection() {// ��������ֵΪconnection�ķ���(��������������)
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
		Conn2 c = new Conn2();
		c.getConnection();
		try {
			sql = con.createStatement();// ʵ����statement����
			res = sql.executeQuery("select * from ticketre");// ���Ͳ�ѯ��䣬���ѽ��ֵ���ظ�res			
			while (res.next()) {// �����ǰ��䲻�����һ������ѭ��(���һ����䷵��false)
				String id = res.getString("id");// ��ȡ��ǰ������id�ֶ�
				String start = res.getString("start");
				String end = res.getString("end");
				String date = res.getString("time");
				System.out.println("��ţ�" + id);
				System.out.println("����վ��" + start);
				System.out.println("�յ�վ��" + end);
				System.out.println("ʱ�䣺" + date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
/*
 * java.sql���е�Connection�ӿڣ�ͨ��DriverManager��ľ�̬����getConnection()�������Ӷ���
 * Class����java.lang���е�һ���࣬ͨ������ľ�̬����forName()�ɼ���MySQL��jdbc����
 * Statement�ӿڵ�executeQuery()��������ResultSet�ӿڵ�next()����һ����
 */
