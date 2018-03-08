package com.stage.pfe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stage.pfe.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}