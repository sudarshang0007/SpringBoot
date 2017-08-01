package com.database.DBtest;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Override
	public Iterable<User> findAll();

	@Override
	public <S extends User> S save(S entity);
	
	public User findById(Integer id);

}
