package xyz.itwill09.util;

import org.springframework.scheduling.annotation.Scheduled;

public class Scheduler {
	//@Scheduled(cron = "1 * * * * *")
	//@Scheduled(cron = "0 1 * * * *")
	//@Scheduled(cron = "0 0 5 * * *")
	//@Scheduled(cron = "0 0 5 1 * *")
	//@Scheduled(cron = "0 0 5 1 1 *")
	//@Scheduled(cron = "0 0 5 * * 1-5")
	@Scheduled(cron = "0 0 5 1 1-12/3 *")
	public void autoupdate() {
		System.out.println("### Scheduler 클래스의 autoupdate() 메소드 호출 ###");
	}
}
