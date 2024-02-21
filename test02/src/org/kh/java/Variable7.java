package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {
		String name = "이원석";	// 첫문자가 대문자면 
		Integer age = 31;
		String age2 = "43";
		int age3 = Integer.parseInt(age2)+ 8;
		Float height = 178.3f;
		String height2 ="173.6";
		float height3 = Float.parseFloat(height2);
		//boolean pass = true;
		Double weight = 85.2;
		
		System.out.println("age : "+age3);
		System.out.println("name : "+name.getClass().getName());
		System.out.println("age : "+age.getClass().getName());
		System.out.println("height : "+height.getClass().getName());
		System.out.println("weight : "+weight.getClass().getName());
		//primitive type => wrapper type = boxing 	class 처럼 보이기위해서
		//wrapper type => primitive type = unboxing
		
	}

}
