package example;

public class VariableExample {
	public static void main(String[] args) {
		//가로의 길이가 7이고 세로의 길이가 10인 사각형의 넓이를 계산하여 출력하세요.
		int garo=7, sero=10;
		System.out.println("가로 = "+garo);
		System.out.println("세로 = "+sero);
		int nulbe=garo*sero;
		System.out.println("사각형의 넓이 = "+nulbe);		
		System.out.println("==============================================================");		
		//높이가 9이고 밑변의 길이가 7인 삼각형의 넓이를 계산하여 출력하세요.
		int nohee=9, meebeon=7;
		System.out.println("높이 = "+nohee);
		System.out.println("밑변 = "+meebeon);
		double nulbee=nohee*meebeon/2.;
		System.out.println("삼각형의 넓이 = "+nulbee);		
		System.out.println("==============================================================");
		//10명의 전체 몸무게가 759Kg인 경우 평균 몸무게를 계산하여 출력하세요.
		int saram=10, momeugeh=759;
		System.out.println("사람 수 = "+saram);
		System.out.println("전체 몸무게 = "+momeugeh);
		double ave=(double)momeugeh/saram;
		System.out.println("평균 몸무게 = "+ave);	
		System.out.println("==============================================================");
		//이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		//총점과 평균을 계산하여 이름, 총점, 평균을 출력하세요.
		//단, 평균은 소숫점 한자리까지만 출력하고 나머지는 절삭 처리 하세요.
		String name="홍길동";
		System.out.println("이름 = "+name);
		int kor=89, eng=93, math=95;
		int tot=kor+eng+math;
		System.out.println("총점 = "+tot);
		double avee=tot/3.;
		System.out.println("평균 = "+(int)(avee*10)/10.);			
		System.out.println("==============================================================");		
	}

}
