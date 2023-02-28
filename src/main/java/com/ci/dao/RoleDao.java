package com.ci.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ci.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
