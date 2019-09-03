package com.twitter.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.twitter.entity.TwitterEmployee;

public class TwitterDAO implements TwitterDAOInterface {
private TwitterDAO()
{
}

	


public static TwitterDAOInterface createDaoObject(String string) {
	// TODO Auto-generated method stub
	return new TwitterDAO();
}

@Override
public int createProfileDAO(TwitterEmployee te) {
	int i=0;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Zensar123");
		PreparedStatement ps=con.prepareStatement("insert into twitteremployee values(?,?,?,?)");
		ps.setString(1, te.getName());
		ps.setString(2, te.getPass());
		ps.setString(3, te.getEmail());
		ps.setString(4, te.getAddress());
		i=ps.executeUpdate();
		
	   }
	catch(Exception e){
		e.printStackTrace();
	}
	
return i;
//	return 0;
}



}