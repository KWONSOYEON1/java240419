package oop;

//클래스(Class) : 다수의 객체(Object)를 생성하기 위한 자료형 - 참조형
// => Java 언어에서는 객체(Object) 대신 인스턴스(Instance)로 표현
// => 현실에 존재하는 대상을 모델링하여 클래스라는 자료형으로 선언하고 프로그램에서 사용할 수
//있도록 클래스로 객체 생성

//클래스 선언 방법
//형식) [public] class 클래스명 {
//       	필드(Field) : 표현대상의 속성(값)을 저장하기 위한 변수 - 멤버변수
//			생성자(Constructor) : 객체를 생성하기 위한 특별한 메소드
//			메소드(Method) : 표현 대상의 행위(기능)을 제공하기 위한 함수 - 멤버함수
//      }
// => 클래스명은 식별자로 파스칼 표기법을 사용하여 작성하는 것을 권장
// => 클래스에 작성된 메소드는 필드를 사용하여 필요한 행위(기능)를 구현하도록 명령 작성 
// => 클래스에 생성자를 작성하지 않으면 매개변수가 없는 기본 생성자가 자동으로 생성되어 제공

//클래스를 사용하여 객체를 생성하는 방법
//형식)클래스명 참조변수=new 클래스명();
// => new 연산자로 클래스에 작성된 기본 생성자를 호출하여 객체 생성
// => 힙(Heap)영역에 생성된 객체의 메모리 주소를 참조변수에 저장하여 참조변수에 저장된 
//메모리 주소를 사용해 객체 참조
// => 참조변수에 저장된 메모리 주소로 객체를 참조해 [.] 연산자로 클래스에 작성된 필드 또는 메소드 사용

//자동차를 모델링하여 작성된 클래스
// => 속성 : 모델명, 엔진상태, 현재속도 - 필드
// => 행위 : 시동 온(On), 시동 오프(Off), 속성 증가, 속도 감소, 이동 중지 - 메소드
public class Car {
	//필드(Field) : 표현대상의 속성값을 저장하기 위한 변수
	// => 클래스에 작성된 모든 메소드에서 필드 사용 가능
	String modelName;//모델명
	boolean engineStatus;//엔진상태 - false : EngineOff, true : EngineOn
	int currentSpeed;//현재속성
	
	//생성자(Constructor) : 객체를 생성하기 위한 특별한 메소드
	// => 클래스에 생성자를 작성하지 않으면 매개변수가 없는 기본 생성자(Default Constructor)가 
	//자동으로 생성되어 제공
	
	//메소드(Method) : 표현대상의 행위(기능)을 제공하기 위한 함수
	// => 필드를 사용하여 메소드에 작성된 명령으로 원하는 기능 구현
	
}