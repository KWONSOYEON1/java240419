package basic;//클래스가 작성된 패키지를 표현하기 위해 사용하는 문장

//주석문 : 프로그램 실행과 아무런 상관없는 설명문을 제공하기 위한 문장
// => 유지보수의 효율성 증가를 위해 소스코드에 설명문 제공
// => 행주석(//설명문)과 범위주석(/* 설명문 */) - source 주석

/*
프로그램 이름 : FirstEclipse
프로그램 버전 : 1.0
개발도구 : JDk17
 */

/**이클립스로 만든 프로그램 - API 주석 */
public class FirstEclipseApp {
	/*JVM에 의해 자동으로 호출되는 메소드*/
	/**JVM에 의해 자동으로 호출되는 메소드*/
	public static void main(String[] args) {
		System.out.print("이클립스로 처음 만든 프로그램입니다.");
		System.out.println();//엔터(Enter) 출력
		System.out.println("열심히 해봐요.");
	}
}
