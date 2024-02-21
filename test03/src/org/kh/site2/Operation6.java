package org.kh.site2;
//논리 연산자 : &&(and), ||(or), !(not)
public class Operation6 {

	public static void main(String[] args) {
		int a = 26;
		int b = 28;
		int c = 27;
		// and 논리 : 모든 입력이 true 일때만 출력이 true가 된다.
		System.out.println("a > b && b > c"+(a > b && a > c));//false and false
		System.out.println("a > b && b > c"+(a > b && b > c));//false and true
		System.out.println("a > b && b > c"+(a < b && b < c));//true and false
		System.out.println("a > b && b > c"+(a < b && b > c));//true and true
		// or 논리 : 입력이 어느 하나라도 true가 있으면 출력이 true가 된다.
		System.out.println("a > b || b > c"+(a > b || a > c));
		System.out.println("a > b || b > c"+(a > b || b > c));
		System.out.println("a > b || b > c"+(a < b || b < c));
		System.out.println("a > b || b > c"+(a < b || b > c));
		// not 논리 : 입력이 true 이면 출력은 false, 입력이 false 이면 출력은 true.
		System.out.println("!(a > b) :"+!(a > b));
		System.out.println("!(a < b) :"+!(a < b));
	}

}
