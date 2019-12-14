package java_JDBC;

import java.sql.*;

public class TestInsert {// 添加数据,删除数据
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
		String ay=" '茅野爱衣'  ";
		try {
			sql = con.createStatement();
			sql.executeUpdate("delete from userlist where name='茅野爱衣'");//删除数据
//			sql.executeUpdate("insert into userlist(id,name,stuNum,password) values("+ a +","+ay+",10000,'ay07')");// 添加数据
			res = sql.executeQuery("select * from userlist");// 查询数据
			while (res.next()) {//必须用while语句
				String name = res.getString("name");
				String num = res.getString("stuNum");
				String pw = res.getString("password");
				System.out.println("姓名：" + name);
				System.out.println("学号：" + num);
				System.out.println("密码：" + pw);
				System.out.println();
			}
		} catch (Exception w) {
			w.printStackTrace();
		}

	}

}
