package java_JDBC;

import java.sql.*;

public class TestUpdate {// �޸�����
	static Connection con;
	static Statement sql;
	static ResultSet res;

	//�������ݿ�ķ���
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException w) {
			w.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "520ycsqlbegen");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	//������
	public static void main(String[] args) {
		TestUpdate sollan=new TestUpdate();
		sollan.getConnection();
		
		try {
			sql=con.createStatement();//��Ҫ�����
			sql.executeUpdate("update userlist set stuNum='162011375' where name='Ҷ�ܴ�'");//�޸�����
			
			res=sql.executeQuery("select *from userlist");//�η���ֻ�����ڲ�ѯ
			while(res.next()) {
				String name=res.getString("name");
				String  num=res.getString("stuNum");
				String pw=res.getString("password");
				System.out.println("������"+name);
				System.out.println("ѧ�ţ�"+num);
				System.out.println("���룺"+pw);
				System.out.println();
			}
			
		}catch(Exception w) {
			w.printStackTrace();
		}
	}
}
