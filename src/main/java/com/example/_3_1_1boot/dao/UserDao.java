package com.example._3_1_1boot.dao;

import com.example._3_1_1boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
