package com.pratap.functional.collector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {

	public static void main(String[] args) {

		String pathVar = "/Users/835698/development/functional-programming/functional-and-reactive/src/main/java/com/pratap/functional/collector/EmployeeData";
		
		Path path = Paths.get(pathVar);
		
		try(Stream<String> lines = Files.lines(path);){
			
			Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(", ")));
			
			Spliterator<String> wordSpliterator = words.spliterator();
			
			Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);
			
			Stream<Employee> employeeStream = StreamSupport.stream(employeeSpliterator, false);
			
			List<Employee> employeeList = employeeStream.collect(Collectors.toList());
//			employeeList.forEach(System.out::println);
			System.out.println("-------toList Collectors---------");
			employeeList.stream().map(employee -> employee.getName()).collect(Collectors.toList()).forEach(System.out::println);
			System.out.println("-------toSet Collectors---------");
			
			employeeList.stream().map(employee -> employee.getDesignation()).collect(Collectors.toSet()).forEach(System.out::println);
			System.out.println("-------sorting in Employee Collectors TreeSet---------");
			employeeList.stream().collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);
			
			System.out.println("get name wrt their ids");
			
			Map<Integer, String> getNameById = employeeList.stream()
			.collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
			
			System.out.println(getNameById);
			
			System.out.println("-------------------Partitioned Data-------------");
			
			Map<Boolean, List<Employee>> partitionedData = employeeList.stream()
			.collect(Collectors.partitioningBy(employee -> employee.getGender() == 'F'));
			
			System.out.println(partitionedData);
			
			List<Employee> femleData = partitionedData.get(true);
			
			System.out.println(femleData);
			
			System.out.println("---------Grouping By ----------------");
			
			Map<String, List<Employee>> getByDesignation = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDesignation()));
			
			System.out.println(getByDesignation);
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
