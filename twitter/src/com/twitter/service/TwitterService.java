package com.twitter.service;

import com.twitter.dao.TwitterDAO;
import com.twitter.dao.TwitterDAOInterface;
import com.twitter.entity.TwitterEmployee;

public class TwitterService implements TwitterServiceInterface {
  private  TwitterService()
  {}
	public static TwitterServiceInterface createServiceObject(String string) {
		// TODO Auto-generated method stub
		return new  TwitterService();
	}
	@Override
	public int createProfile(TwitterEmployee te) {
		// TODO Auto-generated method stub
		TwitterDAOInterface td=TwitterDAO.createDaoObject("t");
	
		return td.createProfileDAO(te);
	}

}
