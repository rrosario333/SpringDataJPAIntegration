package com.robert.springdata.jpa.persistence.repository;

import java.util.List;

import com.robert.springdata.jpa.persistence.entity.Employee;

/**
 * Created by robert.
 */
public interface EmployeeRepositoryCustom {

    List<Employee> getFirstNamesLikeAndBonusBigger(String firstName, Double bonusAmount);

}
