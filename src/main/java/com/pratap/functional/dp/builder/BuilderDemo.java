package com.pratap.functional.dp.builder;

public class BuilderDemo {

	public static void main(String[] args) {

		MobileBuilder builder = new MobileBuilder();
		Mobile createMobile = builder.with( myBuilder -> {
										myBuilder.ram = 4;
										myBuilder.storage = 64;
										myBuilder.battery = 5000;
										myBuilder.camera = 104;
									}).createMobile();
		System.out.println(createMobile);
		
	}

}
