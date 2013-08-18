package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestPostgres {
	public static void main(String[] args) {
		testConn();
	}
	public static void testConn(){
		try{
			Class.forName("org.postgresql.Driver");
			Connection conn=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "postgres");
			System.out.println(conn.isClosed());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
