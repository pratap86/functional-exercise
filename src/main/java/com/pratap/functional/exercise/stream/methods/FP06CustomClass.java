package com.pratap.functional.exercise.stream.methods;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP06CustomClass {

	public static void main(String[] args) {

		List<Cource> cources = List.of(new Cource("Spring", "Framework", 98, 10000),
										new Cource("Spring and Hibernate", "Framework", 92, 20000),
										new Cource("Microservice", "Microservice", 91, 15000),
										new Cource("AWS EC2", "Cloud", 93, 22000),
										new Cource("Hibernate", "Framework", 95, 10000),
										new Cource("Docker", "DevOps", 94, 18000),
										new Cource("Kubernetes", "DevOps", 97, 19000),
										new Cource("Jenkins", "CI/CD", 99, 18000),
										new Cource("API", "Microservice", 96, 1200));
		
		// allmatch
		Predicate<Cource> reviewScoreGreaterThan90Predicate = cource -> cource.getReviewScore() > 90;
		
		Predicate<Cource> reviewScoreLessThan90Predicate = cource -> cource.getReviewScore() < 90;
		
		Predicate<Cource> reviewScoreEqualToPredicate = cource -> cource.getReviewScore() == 91;
		
		System.out.println(cources.stream().allMatch(reviewScoreGreaterThan90Predicate));
		System.out.println(cources.stream().noneMatch(reviewScoreLessThan90Predicate));
		System.out.println(cources.stream().anyMatch(reviewScoreEqualToPredicate));
		
		// sorting
		
		Comparator<Cource> comparingByNoOfStudentsAscOrder = Comparator.comparingInt(Cource::getNoOfStudents);
		Comparator<Cource> comparingByNoOfStudentsDescOrder = Comparator.comparingInt(Cource::getNoOfStudents).reversed();
		
		Comparator<Cource> comparingByNoOfStudentsAndNoOfReviews = Comparator.comparingInt(Cource::getNoOfStudents)
																		.thenComparingInt(Cource::getReviewScore);
		
		System.out.println(
				cources.stream()
				.sorted(comparingByNoOfStudentsAscOrder).collect(Collectors.toList()));
		
		System.out.println(
				cources.stream()
				.sorted(comparingByNoOfStudentsDescOrder).collect(Collectors.toList()));
		
		System.out.println(
				cources.stream()
				.sorted(comparingByNoOfStudentsAndNoOfReviews).collect(Collectors.toList()));
		
		// skip first 2 record than pick top 2
	
		System.out.println(
				cources.stream()
				.skip(2)
				.limit(5)
				.sorted(comparingByNoOfStudentsAscOrder).collect(Collectors.toList()));
		
		System.out.println(
				cources.stream()
				.takeWhile(cource -> cource.getReviewScore() >93)
				.collect(Collectors.toList()));
		
		System.out.println(
				cources.stream()
				//.sorted(Comparator.comparingInt(Cource::getReviewScore))
				.dropWhile(cource -> cource.getReviewScore() > 98)
				.collect(Collectors.toList()));
		
		System.out.println(
				cources.stream()
				.filter(reviewScoreGreaterThan90Predicate)
				.mapToInt(cource -> cource.getReviewScore())
				.sum()
				);
		
		System.out.println(
				cources.stream()
				.filter(reviewScoreGreaterThan90Predicate)
				.mapToInt(cource -> cource.getReviewScore())
				.average().getAsDouble()
				);
		
		System.out.println(
				cources.stream()
				.filter(reviewScoreGreaterThan90Predicate)
				.mapToInt(cource -> cource.getNoOfStudents())
				.count()
				);
		
		System.out.println(
				cources.stream()
				.collect(Collectors.groupingBy(Cource::getCategory))
				);
		
		System.out.println(
				cources.stream()
				.collect(Collectors.groupingBy(Cource::getCategory, Collectors.counting()))
				);
		
		System.out.println(
				cources.stream()
				.collect(Collectors.groupingBy(Cource::getCategory, Collectors.maxBy(Comparator.comparing(Cource::getReviewScore))))
				);
		
		System.out.println(
				cources.stream()
				.collect(Collectors.groupingBy(Cource::getCategory,
						Collectors.mapping(Cource::getName, Collectors.toList())))
				);
	}

}
