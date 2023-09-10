package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserServiceInterface;

@RestController
public class UserController {
	@Autowired
	UserServiceInterface userSrevice;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User u) {
		return userSrevice.InsertData(u);
	}
	
	@GetMapping("get/{id}")
	public User findOneUser(@PathVariable int id) {
		return userSrevice.getOneUser(id);
	}
	
	@GetMapping("getAll")
	public List<User> findAlluser() {
		
		List<User> list=userSrevice.getAlluser();
		return list;
	}
	
	@DeleteMapping("Delete/{id}")
	public void removeUser(@PathVariable int id) {
		userSrevice.deleteData(id);
	}
	
	@PutMapping("/update")
	public User putData(@RequestBody User u) {

		return userSrevice.updateData(u);
	}
}