package com.khoabta.demoORM;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public @Repository interface EmployeesRepository extends CrudRepository<Employees, String>{

}
