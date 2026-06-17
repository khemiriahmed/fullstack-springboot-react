package com.akh.fullstack.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.akh.fullstack.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
