package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserRepository;
import com.model.User;
@Service
public class UserServiceImpl implements UserServiceInterface {

	@Autowired
	UserRepository userRepo;
	public User InsertData(User u) {
		
		return userRepo.save(u);
	}
	@Override
	public User getOneUser(int id) {
		
		return userRepo.findById(id).orElse(null);
	}
	@Override
	public List<User> getAlluser() {
		
		List<User> list=userRepo.findAll();
		return list;
	}
	@Override
	public void deleteData(int id) {
		
		userRepo.deleteById(id);
	}
	@Override
	public User updateData(User u) {
		User exUser=userRepo.findById(u.getId()).orElse(null);
		exUser.setName(u.getName());
		
		return userRepo.save(exUser);
	}
	
	
}