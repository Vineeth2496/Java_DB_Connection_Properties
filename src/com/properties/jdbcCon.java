package com.properties;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class jdbcCon 
{
	public Connection con()
	{
	Connection con=null;
	try
	{
	FileInputStream fi=new FileInputStream("C:\\Users\\vinee\\OneDrive\\Desktop\\Java\\Practice\\Collections Frame Works\\com.properties\\src\\jdbc.properties");
	
	Properties p=new Properties();
	
	p.load(fi);
	
	Class.forName(p.getProperty("driver")).newInstance();
	
	 con=DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
	
	//	System.out.println(con);
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return con;
	}

}
