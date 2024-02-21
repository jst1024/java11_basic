package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		String name = "이원석"; //래퍼런스 타입 데이터 여러개 저장 가능 앞문자 대문자로 시작
		short age = 30;
		float height = 178.1f;
		double weight = 85.3f;
		char init = 'l';
		System.out.printf("%n이름 : \" %s \"",name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중 : %.3f", weight);//소수점 3번째 자리까지 하고싶을때 %.3f로 한다
		System.out.println("\n이니셜 : "+init);
		/* 이스케이프 문자
		 \n : 줄 바꿈
		 \t : 탭
		 \\ : \를 출력할 때 		중요
		 \' : '를 출력
		 \" : "를 출력
		 */
	}

}
