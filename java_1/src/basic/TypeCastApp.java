package basic;

//형변환(TypeCast) : 

public class TypeCastApp {
	public static void main(String[] args) {
		System.out.println("결과 = "+(3+1.5));
		
		double su=10;//10 >> 10.0
		System.out.println("su = "+su);
		
		System.out.println("결과 = "+(95/10));//int / int >> int
		System.out.println("결과 = "+(95.0/10.0));//double / double >> double
		System.out.println("결과 = "+(95.0/10));//double / int(double) >> double
		System.out.println("결과 = "+(95/10.));//int(double) / double >> double
		
		int kor=95, eng=90;//점수를 입력받아 저장
		int tot=kor+eng;//총점을 계산하여 저장
		//double ave=tot/2;//평균을 계산하여 저장 - 연산 결과값(평균) : 정수값
		double ave=tot/2.;//평균을 계산하여 저장 - 연산 결과값 (평균) : 실수값
		System.out.println("총점 = "+tot+", 평균 ="+ave);
		
		//int 자료형보다 작은 자료형의 값을 연산할 경우 무조건 int 자료형으로 자동 형변환되어			
		byte su1=10, su2=20;
		//byte su3=su1+su2;//byte +byte >> int + int >> int(연산 결과값) - byte 변수에 저장할
		int su3=su1+su2;
		System.out.println("su3 = "+su3);
		System.out.println("==========");
		//강제 형변환 : 
		int num=(int)12.3;//(int)12.3 >>12
		System.out.println("num = "+num);
		
		int num1=95, num2=10;
		//double num3=(double)num1 /num2;//연산결과값 : 9 >> 변수값 : 9.0(자동형변환)
		double num3=(double)num1 /num2;//연산결과값 : 9.5 >> 변수값 : 9.5
		System.out.println("num3 ="+num3);
		
		//큰 정수값은 [_] 기호를 사용하여 표현 가능
		int num4=100_000_000, num5=30;
		//문제점)정수값은 4Byte(-2147483648~2148483647)로 표현되므로 연산 결과값리 4Byte의
		//표현범위를 벗어날 경우 잘못된 결과값(쓰레기값)이 변수에 저장 - 실행 오류
		//int num6=num4 *num5;
		//해결법) 연산 결과값이 4Byte의 표현 
		long num6=(long)num4 *num5;
		System.out.println("num6 = "+num6);
		
		double number=1.23456789;
		System.out.println("number = "+number);
		
		//변수에 저장된 실수값을 소수점 2번째 자리까지만 출력되도록 변환 처리
		System.out.println("number(내림) = "+(int)+(number*100)/100.);
		System.out.println("number(반올림) = "+(int)+(number*100+0.5)/100.);
		System.out.println("number(올림) = "+(int)+(number*100+0.9)/100.);
	}
}
