package java_JDBC;

import java.sql.*;

public class TestInsert {// �������,ɾ������
	static Connection con;
	static Statement sql;
	static ResultSet res;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException w) {
			w.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "520ycsqlbegen");
		} catch (SQLException w) {
			w.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		TestInsert sollan = new TestInsert();
		sollan.getConnection();
		int a=103;
		String ay=" 'éҰ����'  ";
		try {
			sql = con.createStatement();
			sql.executeUpdate("delete from userlist where name='éҰ����'");//ɾ������
//			sql.executeUpdate("insert into userlist(id,name,stuNum,password) values("+ a +","+ay+",10000,'ay07')");// �������
			res = sql.executeQuery("select * from userlist");// ��ѯ����
			while (res.next()) {//������while���
				String name = res.getString("name");
				String num = res.getString("stuNum");
				String pw = res.getString("password");
				System.out.println("������" + name);
				System.out.println("ѧ�ţ�" + num);
				System.out.println("���룺" + pw);
				System.out.println();
			}
		} catch (Exception w) {
			w.printStackTrace();
		}

	}

}
