package com.ex.mockito.MockitoJunitTest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 
    public Employee findByName(String name);
 
}