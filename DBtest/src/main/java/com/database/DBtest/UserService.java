package com.database.DBtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repository;


	@Cacheable(value="user")
	public User findById(Integer id) {
		return repository.findById(id);
	}

	public List<User> findAll() {
		return (List<User>) repository.findAll();
	}

	
	public void save(User user) {
		repository.save(user);
	}
	
	
}
