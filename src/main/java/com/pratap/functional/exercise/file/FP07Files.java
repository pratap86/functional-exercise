package com.pratap.functional.exercise.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FP07Files {

	public static void main(String[] args) throws IOException {
		
		Stream<String[]> streamOfStringArray = Files.lines(Paths.get("file.txt"))
					.map(str -> str.split(" "));
		Stream<String> streamOfString = streamOfStringArray.flatMap(Arrays::stream);
		
		streamOfString.distinct().sorted().forEach(System.out::println);
	}

}
