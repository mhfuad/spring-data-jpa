package com.relation.reation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.reation.Entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
