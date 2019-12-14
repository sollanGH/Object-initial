package java_JDBC;

import java.sql.*;

public class TestUpdate {// 修改数据
	static Connection con;
	static Statement sql;
	static ResultSet res;

	//连接数据库的方法
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

	//主函数
	public static void main(String[] args) {
		TestUpdate sollan=new TestUpdate();
		sollan.getConnection();
		
		try {
			sql=con.createStatement();//必要的语句
			sql.executeUpdate("update userlist set stuNum='162011375' where name='叶绍春'");//修改数据
			
			res=sql.executeQuery("select *from userlist");//次方法只能用于查询
			while(res.next()) {
				String name=res.getString("name");
				String  num=res.getString("stuNum");
				String pw=res.getString("password");
				System.out.println("姓名："+name);
				System.out.println("学号："+num);
				System.out.println("密码："+pw);
				System.out.println();
			}
			
		}catch(Exception w) {
			w.printStackTrace();
		}
	}
}
