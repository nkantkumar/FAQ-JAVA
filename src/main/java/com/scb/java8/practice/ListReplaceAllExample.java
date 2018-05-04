package com.scb.java8.practice;

import java.util.Arrays;
import java.util.List;
public class ListReplaceAllExample {
  static 
		  List<Employee> employeeList = Arrays.asList(new Employee(1, 23, "M", "Rick", "Beethovan"),

					new Employee(5, 19, "F", "Cristine", "Maria"));
  public static void main(String[] args) {
    employeeList.replaceAll(employee -> {
      employee.setAge(employee.getAge() * 1.1);
      return employee;
    });
    System.out.println("Employee list with all salaries incremented by 10%");
    employeeList.forEach(System.out::println);
  }
}
