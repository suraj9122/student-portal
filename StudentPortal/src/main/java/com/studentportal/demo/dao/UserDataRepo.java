package com.studentportal.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.studentportal.demo.user;
public interface UserDataRepo extends JpaRepository<user,Integer>{

}
