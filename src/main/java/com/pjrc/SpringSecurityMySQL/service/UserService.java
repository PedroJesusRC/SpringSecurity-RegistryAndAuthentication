package com.pjrc.SpringSecurityMySQL.service;

import com.pjrc.SpringSecurityMySQL.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
