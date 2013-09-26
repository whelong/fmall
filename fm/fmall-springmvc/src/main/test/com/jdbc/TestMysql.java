package com.jdbc;

import java.sql.DriverManager;

import java.sql.Connection;

public class TestMysql {
	public static void main(String[] args) {
		testConn();
	}
	public static void testConn(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println(conn.isClosed());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
