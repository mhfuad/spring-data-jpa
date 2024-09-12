package com.relation.reation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.reation.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
