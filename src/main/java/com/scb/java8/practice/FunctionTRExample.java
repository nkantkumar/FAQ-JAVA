package com.scb.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;



public class FunctionTRExample {
	public static void main(String args[]) {
		Function<Employee, String> funcEmpToString = (Employee e) -> {return e.getFirstName();	};
		List<Employee> employeeList = Arrays.asList(new Employee(1, 23, "M", "Rick", "Beethovan"),

				new Employee(5, 19, "F", "Cristine", "Maria"));
		List<String> empNameList = convertEmpListToNamesList(employeeList, funcEmpToString);
		empNameList.forEach(System.out::println);
		
		FunctionTRExample fr = new FunctionTRExample();
		fr.java8(employeeList);
	}

	

	public static List<String> convertEmpListToNamesList(List<Employee> employeeList,
			Function<Employee, String> funcEmpToString) {
		List<String> empNameList = new ArrayList<String>();
		for (Employee emp : employeeList) {
			empNameList.add(funcEmpToString.apply(emp));
		}
		return empNameList;
	}
	
	
	private void java8(List<Employee> employeeList) {
		// TODO Auto-generated method stub
     employeeList.stream().collect(Collectors.partitioningBy((Employee e)-> e.getAge() >10));
		
     employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
     employeeList.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.toSet()));
		
	}
		
}