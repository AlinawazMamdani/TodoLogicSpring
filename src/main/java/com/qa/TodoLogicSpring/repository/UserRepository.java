package com.qa.TodoLogicSpring.repository;

import com.qa.TodoLogicSpring.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository <User,Long>{

}

