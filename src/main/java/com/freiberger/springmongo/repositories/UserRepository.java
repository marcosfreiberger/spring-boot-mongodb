package com.freiberger.springmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.freiberger.springmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
