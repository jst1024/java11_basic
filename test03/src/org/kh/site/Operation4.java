package org.kh.site;
//증감 연산 : ++ , --  => 전위 연산, 후위 연산이 각각 있음
public class Operation4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println("전위 증가 연산 : "+(++a));
		System.out.println("후위 증가 연산 : "+(b++));	//출력은 10 이지만 값은 11
		System.out.println("전위 감소 연산 : "+(--a));
		System.out.println("후위 감소 연산 : "+(b--));
	}

}
