package com.google.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MavenSample {
	
	public static void main(String args[])throws Exception
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your product id");
		int id=scan.nextInt();
		String sql="select PID,PNAME,PRICE from product where PID=?";
		Class.forName("oracle.jdbc.OracleDriver");
		Connection  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getInt("PID")+":"+rs.getString("PNAME")+":"+rs.getFloat("PRICE"));
		}else
		{
			System.out.println("Invalid productId");
		}
		rs.close();
		ps.close();
		con.close();
	}

}
