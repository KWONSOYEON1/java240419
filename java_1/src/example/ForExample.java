package example;

public class ForExample {
	public static void main(String[] args) {
		//본인 이름을 화면에 7번 출력하세요.
		//ex) 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동
		for(int i=1;i<=7;i++) {
			System.out.print("권소연 ");
		}
		System.out.println();
		
		System.out.println("=========================================");
		//1~10 범위의 정수 중 홀수를 화면에 출력하세요.
		//ex) 1     3     5     7     9
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();			
		/*
		for(int i=1;i<=9;i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		*/
		
		System.out.println("=========================================");
		//1~100 범위의 정수에서 3의 배수들의 합계와 5의 배수들의 합계를 계산하여
		//3의 배수의 합계에서 5의 배수의 합계를 뺀 결과값을 출력하세요.
		//ex) 결과 = 633
		/*int thr=0;
		for(int i=1;i<=100;i++)
			if(i%3==0) {
				thr+=i;
			}	
		int fiv=0;
		for(int j=1;j<=100;j++)
			if(j%5==0) {
				fiv+=j;
			}	
		System.out.println("결과 = "+(thr-fiv));
		*/
		
		int tot3=0, tot5=0;
		for(int i=1;i<=100;i++) {
			if(i % 3 == 0) tot3+=i;
			if(i % 5 == 0) tot5+=i;
		}
		System.out.println("결과 = "+(tot3-tot5));
		
		
		System.out.println("=========================================");
		//구구단 중 7단을 화면에 출력하세요.
		//ex) 7 * 1 = 7
		//    7 * 2 = 14
		//    ...
		//    7 * 8 = 56
		//    7 * 9 = 63
		
		/*for(int i=7;i<=7;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		*/
		
		int dan=7;
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
		
		
		System.out.println("=========================================");
		//5!의 결과값을 출력하세요.(5! = 5 * 4 * 3 * 2 * 1)
		//ex) 5! = 120
		/*
		int mul=1; 
		for(int i=1;i<=5;i++) {
			mul*=i;
		}
		System.out.println("5! = "+mul);
		*/
		
		int fac=1, num=5;
		for(int i=num;i>=1;i--) {
			fac*=i;
		}
		System.out.println(num+"! = "+fac);
		
		
		System.out.println("=========================================");
		//두 변수에 저장된 범위의 정수값을 화면에 출력하세요.
		//단, 한 줄에 정수값이 7개씩 출력되도록 프로그램을 작성하세요.
		//ex) 36    27    38     39     40     41     42
		//    43    44    45     46     47     48     49
		//    50    51    52     53     54     55     56
		//    57
		/*
		int begin=36, end=57;
			for(int i=begin;i<=end;i++) {
			System.out.print(i+"\t");
			if(i%7==0) {
				System.out.println();
			}			
		}
		System.out.println();
		*/
		
		int begin=36, end=57;
		int cnt=0;//출력된 정수값의 갯수를 저장하기 위한 변수
		
		for(int i=begin;i<=end;i++) {
			System.out.print(i+"\t");
			cnt++;
			if(cnt % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("=========================================");	
	}
}