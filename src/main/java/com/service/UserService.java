package com.service;

import com.bean.User;
import com.dao.UserDao;

public class UserService {
UserDao ud = new UserDao();


public String signIn(User u) {
	if (ud.signIn(u) > 0) {
		return "Login Successfull";
	}else {
		return "Login Failed Please Try Again";
	}
}
}
