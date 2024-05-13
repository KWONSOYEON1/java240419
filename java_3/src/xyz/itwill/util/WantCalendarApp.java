package xyz.itwill.util;

import java.util.Calendar;
import java.util.Scanner;

//키보드로 [년]과 [월]을 입력받아 해당 년월에 대한 달력을 출력하는 프로그램 작성
public class WantCalendarApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("년: ");
		int year=Integer.parseInt(scanner.nextLine());
		System.out.print("월: ");
		int month=Integer.parseInt(scanner.nextLine());
	
		scanner.close();
		
		Calendar calendar=Calendar.getInstance();
		
		calendar.set(year, month-1, 1);
		
		int week=calendar.get(Calendar.DAY_OF_WEEK);				
		
		System.out.println("      "+year+"년 "+month+"월");
		System.out.println("=======================");
		System.out.println("  일 월 화 수 목 금 토");
		System.out.println("=======================");
		
		for(int i=1;i<week;i++) {
			System.out.print("   ");
		}
		for(int i=1;i<=calendar.getActualMaximum(Calendar.DATE);i++) {
			if(i<=9) {
				System.out.print("  "+i);
			} else {
				System.out.print(" "+i);
				}
			week++;
			
		if(week % 7 == 1) {
			System.out.println("");
		}
			
		}
		System.out.println();
		System.out.println("=======================");
	}
}