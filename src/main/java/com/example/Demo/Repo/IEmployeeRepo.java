package com.example.Demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Demo.Entity.Employee99;

public interface IEmployeeRepo extends JpaRepository<Employee99, Integer> {

}
