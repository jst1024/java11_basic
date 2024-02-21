package org.kh.java;

public class Constant1 {

	public static void main(String[] args) {
		//상수(constant)와 리터럴(Literal)
		final int MAX_POINT = 100;
		final int MIN_POINT = 0;
		final double PI = 3.141592;
		final String MY_NAME = "이원석";
		//위와 같이 final 지시자가 선언되고, 대문자로 표기된 변수를 상수라고 하며,
		//항상 값이 같아 더이상 변할 수 없는 값을 뜻함
		//변수나 상수에 대입되는 값을 리터럴(Literal)이라고 함.
		//2진수, 10진수, 8진수 ,16진수 , 문자, 문자열, 정수, 실수
		System.out.println("최소 점수 : "+MIN_POINT);
		System.out.println("최대 점수 : "+MAX_POINT);
		System.out.println("파이 값 : "+PI);
		System.out.println("나의 이름 : "+MY_NAME);
	}

}
