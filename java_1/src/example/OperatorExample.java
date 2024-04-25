package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		int tot=245678;
		int day=tot/(60*60*24);//24*60*60 = 86400
		tot %= 60*60*24;//변수에 저장된 초단위 시간에서 몫(일) 을 제외한 나머지 값을 계산하여 저장
		int hour=tot/(60*60);//60*60 = 3600
		tot %= 60*60;//변수에 저장된 초단위 시간에서 몫(시간)을 제외한 나머지 값을 계산하여 저장
		int min=tot/60;
		tot %= 60;
		int sec=tot;
				
		System.out.println("245678초 = "+day+"일 "+hour+"시 "+min+"분 "+sec+"초 ");						
		System.out.println("==============================================================");
		
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요.
		int cost=150_000_000;
		int n=20;
		long sum =(long)(n>=15 ? cost*0.75 : cost)*n;
		System.out.println("지불금액 = "+sum+"원");
		System.out.println("==============================================================");
	}
}
