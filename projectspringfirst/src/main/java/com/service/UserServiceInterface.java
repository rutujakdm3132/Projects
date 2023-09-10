package com.service;

import java.util.List;

import com.model.User;

public interface UserServiceInterface {
	User InsertData(User u);
	User getOneUser(int id);
	List<User> getAlluser();
	void deleteData(int id);
	User updateData(User u);
}
