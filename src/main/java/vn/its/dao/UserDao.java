package vn.its.dao;

import vn.its.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

