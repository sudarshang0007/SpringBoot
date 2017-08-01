package com.database.DBtest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user")
	public List<User> getUser() {
	return	(List<User>) userService.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User findbyId(@PathVariable("id") Integer Id){
		return userService.findById(Id);
	}

	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		userService.save(user);
	}
	

}
