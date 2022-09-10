package com.kiran.service;

import com.kiran.dto.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@Slf4j
public class EmployeeService {


    public List<Employee> getEmployees() {
       List<Employee> employees = IntStream.rangeClosed(1, 10)
                .mapToObj(i-> new Employee(i, "employee "+ i)).collect(Collectors.toList());
       log.info("Employee Service : " + employees.size());
       return employees;
    }

}
