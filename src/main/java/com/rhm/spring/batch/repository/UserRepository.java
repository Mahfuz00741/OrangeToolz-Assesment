package com.rhm.spring.batch.repository;

import com.rhm.spring.batch.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
