package org.example.learn.spring.boot.druid.hello.dao;

import org.example.learn.spring.boot.druid.hello.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
