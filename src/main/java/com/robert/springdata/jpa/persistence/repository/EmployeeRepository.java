package com.robert.springdata.jpa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.robert.springdata.jpa.persistence.entity.Employee;

import java.util.List;

/**
 * Created by robert.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>, EmployeeRepositoryCustom {

    List<Employee> fetchByLastNameLength(@Param("length") Long length);
}
