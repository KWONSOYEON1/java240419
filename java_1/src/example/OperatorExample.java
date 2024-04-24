package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		int tot=245678;
		
		int days=tot/(60*60*24);
		tot %= 60*60*24;
		int hours=tot/(60*60);
		tot %= 60*60;
		int minutes=tot/60;
		tot %= 60;
		int seconds=tot;
				
		System.out.println("245678초 = "+days+"일"+hours+"시"+minutes+"분"+seconds+"초");						
		System.out.println("==============================================================");
		
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요.
		int cost=150000000;
		int n=20;
		long sum =(long)(n>=15 ? cost*0.75*n : cost*n);
		System.out.println("금액 = "+sum+"원");
		System.out.println("==============================================================");
	}
}
