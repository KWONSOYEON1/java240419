package example;

import java.util.Scanner;

//키보드로 정수값을 입력받아 1~9 범위의 정수값을 곱한 결과를 출력하는 프로그램을 작성하세요.
//단,키보드로 입력된 정수값은 2~9 범위의 정수값만 허용하며 범위를 벗어난 정수값을 입력한 경우
//에러 메세지 출력 후 재입력하도록 프로그램 작성
//ex) 단 입력[2~9] >> 7
//    7 * 1 = 7
//    ...
//    7 * 9 = 63
public class GuGuDanExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		/*	
		while(true) {
			System.out.print("단 입력[2~9] >> ");
			int number=scanner.nextInt();
			if(number <2 || number >9) {
				System.out.println("[에러] 재입력하세요.");
				continue;
			}					
			for(int i = 1;i<= 9;i++) {
				System.out.println(number+" * "+i+" = "+number*i);
			}
			break;
			}
		*/
		
		int dan;
		//키보드 입력값을 검증하기 위한 반복문
		// => 정상적인 값이 입력된 경우 break 명령을 사용해 반복문 종료
		while(true) {
			System.out.print("단 입력[2~9] >> ");
			dan=scanner.nextInt();
			if(dan >= 2 && dan <= 9) break;
			System.out.println("[에러]2~9 범위의 정수값만 입력 가능합니다. 다시 입력해 주세요.");
		}
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
			scanner.close();	
	}
}