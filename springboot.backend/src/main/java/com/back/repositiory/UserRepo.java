package com.back.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{

}
