package org.kh.java;

public class Variable5 {

	public static void main(String[] args) {
		char ch1 = 'H';
		char ch2 = 65;		//아스키 코드 'a' 만약 128을 넘는경우 유니코드로 전환
		char ch3 = 82;		//아스키 코드 '_' 
		char ch4 = '\u2665'; 	//유니코드 사용
//		char ch5 = -54 코드넘버는 순번이므로 음수값을 가질 수 없다
		char ch5 = 121;
		char ch6 = '\u26bd';	//이모지 문자로 인식된다
		System.out.println("ch1 = "+ch1);
		System.out.println("ch2 = "+ch2);
		System.out.println("ch3 = "+ch3);
		System.out.println("ch4 = "+ch4);
		System.out.println("ch5 = "+ch5);
		System.out.println("ch6 = "+ch6);
		System.out.println("코드 넘버(번호)");
		System.out.println("ch1 : "+(int)ch1);	// 변수앞에 (int)를 입력하면 강제형변환
		System.out.println("ch2 : "+(int)ch2);
		System.out.println("ch3 : "+(int)ch3);
		System.out.println("ch4 : "+(int)ch4);
		System.out.println("ch5 : "+(int)ch5);
	}

}
