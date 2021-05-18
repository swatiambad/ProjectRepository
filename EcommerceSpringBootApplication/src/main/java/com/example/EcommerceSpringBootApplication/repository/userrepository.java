package com.example.EcommerceSpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EcommerceSpringBootApplication.model.User;

@Repository
public interface userrepository extends JpaRepository<User, Long>{

}
