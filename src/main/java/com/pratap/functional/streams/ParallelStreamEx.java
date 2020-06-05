package com.pratap.functional.streams;

import java.util.List;

public class ParallelStreamEx {

	public static void main(String[] args) {

		List<Employee> employees = DBUtils.getEmployees();
		
		long startTime = System.currentTimeMillis();
		System.out.println("Performing Sequentially : "+
		employees.stream().filter(emp -> emp.getSalary() > 1000).count());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Seqentially time taken for count is "+(endTime - startTime));
		
		
		long startTime1 = System.currentTimeMillis();
		System.out.println("Performing Parallel : "+
		employees.stream().parallel().filter(emp -> emp.getSalary() > 1000).count());
		
		long endTime1 = System.currentTimeMillis();
		System.out.println("Parallel time taken for count is "+(endTime1 - startTime1));
	}

}
