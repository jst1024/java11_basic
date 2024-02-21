package org.kh.java;

public class Variable2 {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;//변수 선언과 초기화 한것(초기화란 값을 최초로 넣어주는것)
		int i;//변수 선언 만 한것 => 그냥 출력시 null pointer 오류 발생
		long l;
		
		i = 30;//초기화
		l = 40L;
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
//		b = 130; overflow
//		b = -130 underflow
		
	}

}
