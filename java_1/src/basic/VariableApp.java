package basic;

//리터럴(Literal) : 프로그램에서 값을 사용하기 위한 표현방법
// => ex) 100, 12.34, 'A', false, "대한민국" 등
//변수(Variable) : 리터럴(값)을 저장하기 위해 메모리에 부여하여 사용하는 이름

//변수 선언 - 메모리에 리터럴(값)을 저장하기 위한 공간을 부여받아 이름 설정
//형식) 자료형 변수명;
// => 자료형(DataType) : 변수에 저장될 리터럴(값)의 형태를 표현하기 위한 단어 - 키워드 또는 식별자
// => 변수명 : 리터럴(값)을 저장하기 위한 메모리 공간의 이름 - 식별자

//키워드 -(Keyword - 예약어) : Java 프로그램 개발을 위해 미리 약속되어져 있는 단어
//식별자(Identifier - 사용자 정의 명칭) : Java 프로그램 개발을 위해 개발자가 선언하여 사용하는 단어
// => 변수명, 메소드명, 클래스명 등을 식별자로 작성

//식별자 작성규칙 
// => 영문자, 숫자, 일부 특수문자(_ 또는 $)를 조합하여 작성 - 영문자외에 다른 문자 사용 가능(비권장)
// => 숫자로 시작되는 식별자 작성 불가능
// => 영문자는 대소문자를 구분하여 작성
// => 기존에 사용된 단어(키워드 포함)로 식별자 작성 불가능

//Java 프로그램 작성시 사용되는 표기법 - 영문자 소문자를 기본적으로 사용하여 식별자 작성
//1.파스칼 표기법(PascalCase) : 조합된 단어의 첫문자를 대문자로 표현하여 작성 - 클래스명, 인터페이스명 등
//2.카멜 표기법(CamelCase) : 조합된 단어 중 첫번쨰 단어를 제외한 나머지 단어의 첫문자를
//대문자로 표현하여 작성 - 변수명, 메소드명 등
//3.스네이크 표기법(SnakeCase) : 조합된 단어를 [_] 기호로 구분하여 작성 - 상수명(Constant)
// => 상수명은 대문자로 작성하는 것을 권장

//자료형(DataType) : 값(객체)을 표현하기 위한 키워드 또는 식별자
// => 값(객체)을 저장하기 위한 변수를 선언할 때 사용
//1.기본형(PrimitiveType) : 값을 표현하기 위한 자료형 - 키워드(8개)
// => 숫자형(정수형, 실수형, 문자형) -연산 가능, 논리형
//2.참조형(ReferenceType) : 특정 대상을 표현하기 위한 자료형 - 식별자(클래스)
// => String 클래스 : 문자열을 표현하기 위한 참조형

public class VariableApp {
	public static void main(String[] args) {
		int su;//정수값을 저장하기 위한 변수 선언 - 메모리에 su 이름의 변수 생성
		//대입연산자(=)를 사용하여 값을 변수에 저장
		// => 대입연산자 왼쪽에는 변수를 오른쪽에는 값을 위치하여 값을 변수에 저장되도록 작성
		su=100;//입력 명령
		System.out.print("초기값 = ");
		System.out.println(su);//변수에 저장된 값을 제공받아 화면에 출력 - 출력 명령

		//int su;//동일한 이름으로 변수를 선언할 경우 에러 발생		
		su=200;//변수에는 기존값 대신 새로운 값 저장
		System.out.print("변경값 = ");
		System.out.println(su);	
		System.out.println("===========");
		int num=100;//변수 선언 및 초기값 저장
		//"문자열"+값 또는 값+"문자열" >>문자열에 값을 결합한 결과값(문자열)을 제공하는 연산식
		System.out.println("num = "+num);
		System.out.println("===========");
		System.out.println("올해는 "+2+0+2+4+"년입니다.");
		System.out.println(2+0+2+4+"년은 호랑이띠입니다.");//잘못된 결과값 출력 - 실행 오류
		//NullString("") : 문자가 하나도 없는 비어 있는 문자열
		System.out.println(""+2+0+2+4+"년은 호랑이띠입니다.");
		System.out.println("===========");		
		//동일한 자료형의 변수는 [,] 기호를 사용하여 나열 선언 가능
		int num1=100, num2=200;
		System.out.println("연산결과 ="+num1+num2);//실행 오류
		System.out.println("연산결과 ="+(num1+num2));
		System.out.println("연산결과 ="+num1*num2);
		System.out.println("연산결과 ="+(num1*num2));
		System.out.println("==========");	
		int kor=88, eng=90;//입력 명령
		//int tot=88+90;
		int tot=kor+eng;//데이터 처리 명령
		System.out.println("점수합계 = "+tot);//출력 명령
		System.out.println("==========");
		//변수에 값이 저장되어 있지 않은 상태에서 변수를 사용할 경우 에러 발생
		//int count;
		//System.out.println("count = "+count);
		
		//변수에 저장할 수 없는 리터럴(값)을 저장 시킬 경우 에러 발생
		//int count=10.0;
		//System.out.println("count = "+count);
		System.out.println("==========");
	}
}