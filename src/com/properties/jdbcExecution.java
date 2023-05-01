package com.properties;

import java.sql.Connection;

public class jdbcExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		jdbcCon c=new jdbcCon();
		Connection con=c.con();
		System.out.println(con);
	}

}
