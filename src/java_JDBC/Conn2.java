package java_JDBC;

import java.sql.*;

public class Conn2 { // 【访问数据库】
	static Connection con;// <连接>接口，用于与特定的数据库建立连接
	static Statement sql;// <声明>接口，在已经建立连接的基础上向数据库发送SQL语句
	static ResultSet res;// <结果>接口，用来暂时存放数据库查询操作所获得的结果集

	public Connection getConnection() {// 创建返回值为connection的方法(可以用其他方法)
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
		Conn2 c = new Conn2();
		c.getConnection();
		try {
			sql = con.createStatement();// 实例化statement对象
			res = sql.executeQuery("select * from ticketre");// 发送查询语句，并把结果值返回给res			
			while (res.next()) {// 如果当前语句不是最后一条，则循环(最后一条语句返回false)
				String id = res.getString("id");// 获取当前列名的id字段
				String start = res.getString("start");
				String end = res.getString("end");
				String date = res.getString("time");
				System.out.println("编号：" + id);
				System.out.println("出发站：" + start);
				System.out.println("终点站：" + end);
				System.out.println("时间：" + date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
/*
 * java.sql包中的Connection接口，通过DriverManager类的静态方法getConnection()创建连接对象
 * Class类是java.lang包中的一个类，通过该类的静态方法forName()可加载MySQL的jdbc驱动
 * Statement接口的executeQuery()方法常与ResultSet接口的next()方法一起用
 */
