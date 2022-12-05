package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.login;

@Repository
public interface LoginRepo extends JpaRepository<login,String> {

}
