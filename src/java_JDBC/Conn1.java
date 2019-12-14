package java_JDBC;

import java.sql.*;

public class Conn1 { // 【连接数据库】
	Connection con;// <连接>接口，用于与特定的数据库建立连接

	public Connection getConnection() {// 创建返回值为connection的方法
		try {
			Class.forName("com.mysql.jdbc.Driver");// 加载数据库驱动类
			System.out.println("数据库驱动加载成功！");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// 连接数据库 参数依次为：数据库地址、名字 用户名 密码
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "520ycsqlbegen");
			System.out.println("数据库连接成功！");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;// 依照方法要求返回Connection类型数据
	}

	public static void main(String[] args) {
		Conn1 c = new Conn1();
		c.getConnection();

	}

}
/*
 * java.sql包中的Connection接口，通过DriverManager类的静态方法getConnection()创建连接对象
 * Class类是java.lang包中的一个类，通过该类的静态方法forName()可加载MySQL的jdbc驱动
 */
