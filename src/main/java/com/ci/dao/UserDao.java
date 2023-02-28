package com.ci.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ci.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
