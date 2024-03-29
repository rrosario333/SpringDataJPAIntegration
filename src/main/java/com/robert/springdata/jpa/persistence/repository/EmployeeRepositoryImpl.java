package com.robert.springdata.jpa.persistence.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.robert.springdata.jpa.persistence.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by robert.
 */
@Repository
@Transactional(readOnly = true)
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Employee> getFirstNamesLikeAndBonusBigger(String firstName, Double bonusAmount) {
        Query query = entityManager.createNativeQuery("select e.* from spring_data_jpa_example.bonus b, spring_data_jpa_example.employee e\n" +
                "where e.id = b.employee_id " +
                "and e.firstname LIKE ? " +
                "and b.amount> ? ", Employee.class);
        query.setParameter(1, firstName + "%");
        query.setParameter(2, bonusAmount);

        return query.getResultList();
    }
}
