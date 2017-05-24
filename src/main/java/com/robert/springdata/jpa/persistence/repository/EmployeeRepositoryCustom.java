package com.robert.springdata.jpa.persistence.repository;

import java.util.List;

import com.robert.springdata.jpa.persistence.entity.Employee;

/**
 * Created by gkatzioura on 6/3/16.
 */
public interface EmployeeRepositoryCustom {

    List<Employee> getFirstNamesLikeAndBonusBigger(String firstName, Double bonusAmount);

}
