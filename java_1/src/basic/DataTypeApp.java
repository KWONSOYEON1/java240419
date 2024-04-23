package basic;

//컴퓨터 저장단위
// => Bit(0 또는 1) - Byte(8Bit)

//자료형(DataType) : 값 또는 객체를 표현하기 위한 단어(키워드 또는 식별자)
// => 기본형(PrimitiveType) : 값을 표현하기 위한 자료형 - 키워드
// => 참조형(ReferenceType) : 객체를 표현하기 위한 자료형 - 식별자(클래스)

//기본형 : 숫자형(정수형, 실수형, 문자형)과 논리형으로 구분하며 값을 저장하기 위한 변수를 선언

public class DataTypeApp {
	public static void main(String[] args) {
		//정수형(IntegerType) : 소수점이 없는 숫자값 - 정수값
		// => Java 언어는 정수값을 기본적으로 4Byte(-2147483648~2147483647)로 표현
		System.out.println("<<정수값(IntegerType)>>");
		System.out.println("정수값(10진수 100) = "+100);
		System.out.println("정수값(8진수 100) = "+0100);
		System.out.println("정수값(16진수 100) = "+0x100);
		System.out.println("정수값(10진수 100) = "+100L);
		
		System.out.println("정수값 = "+2147483647);
		//System.out.println("정수값 = "+2147483648;
		System.out.println("정수값 = "+2147483648L);
		
		byte a1=127;//1Byte : -128~127
		short a2=32767;//2Byte : -32768~32767
		int a3=2147483647;//4Byte : -2147483648~2147483647
		long a4=2147483648L;//8Byte
		
		
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a3 = "+a3);
		System.out.println("a4 = "+a4);
		
		long a5=100;
		System.out.println("a5 = "+a5);
		
		
		System.out.println("==========");
		System.out.println("<<실수형(DoubleType)>>");
		System.out.println("실수값(4Byte) = "+12.3F);//실수값F
		System.out.println("실수값(8Byte) = "+12.3);
		System.out.println("실수값(8Byte) = "+0.00000000000123);
		System.out.println("실수값(8Byte) = "+1.23E10);
		
		
		float b1=1.23456789F;
		double b2=1.23456789;
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("<<문자형(CharacterType)>>");
		System.out.println("문자값 = "+'A');
		System.out.println("문자값 = "+'가');
		System.out.println("문자값 = "+'\'');
		System.out.println("문자값 = "+'\\');
		
		char c1='A';
		char c2=65;
		char c3='a'-32;
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		
		char c4=45000;
		System.out.println("c4 = "+c4);
		System.out.println("==========");
		
		
		System.out.println("<<논리형(BooleanType)>>");
		System.out.println("논리값 = "+false);
		System.out.println("논리값 = "+true);
		System.out.println("논리값 = "+(20 < 10));
		System.out.println("논리값 = "+(20 > 10));
		
		boolean d1=false;
		boolean d2=20>10;
		
		System.out.println("d1 = "+d1);
		System.out.println("d1 = "+d2);
		System.out.println("==========");
		
		System.out.println("<<문자열(StringType)>>");
		System.out.println("문자열 = "+"유관순 열사가 \"대한민국 만세\"를 외쳤습니다.");
		
		String name="임꺽정";
		System.out.println("이름 ="+name);
		System.out.println("==========");
		
		
	}
}
