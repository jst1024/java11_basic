package org.kh.java;
//형 변환1(Auto Casting, Force Casting) = type conversion
public class Casting1 {

	public static void main(String[] args) {
		//작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소로 옮기는것을 Auto Casting이라 한다
		//묵시적 형변환
		byte b = 20;	//1byte
		short s = b;	//2byte	: byte => short
		int i = s;		//4byte 
		long l = i;		//8byte
		
		//큰 크기에 있는 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 저장 데이터값을 신뢰할수없다
		//명시적 형변환
		int i2 = (int)l;
		short s2 =(short)i;
		byte b2 = (byte) s;
		
		
		
		
	}

}
