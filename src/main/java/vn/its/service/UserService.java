package vn.its.service;

import vn.its.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}