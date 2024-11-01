package xyz.itwill.boot.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.itwill.boot.dto.User;

//Thymeleaf : 서버에서 HTML 문서 또는 XML 문서를 동적으로 생성하여 제공하는 Server Side Template Engine
// => HTML 태그에 Thymeleaf 속성을 사용해 동적으로 뷰(View)를 생성하여 제공
// => 서버를 실행하지 않으면 정적인 HTML 문서로 사용되며 서버를 실행하면 동적인 HTML 문서로 
//생성되어 사용 - Natural Templates
// => JSP 태그 및 커스텀 태그(JSTL)를 사용할 수 없어 코드의 재사용 불가능 - JavaScript 사용

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
	@GetMapping("/text")
	public String text(Model model) {
		model.addAttribute("dataOne", "Hi, Thymeleaf!!!");
		model.addAttribute("dataTwo", "<font color='red'>Hi, Thymeleaf!!!</font>");
		
		User user=User.builder().id("abc123").name("홍길동").email("abc@itwill.xyz").build();
		model.addAttribute("user", user);
		
		model.addAttribute("phone", "010-1234-5678");

		model.addAttribute("now1", new Date());
		//LocalDateTime.now() : 현재 날짜와 시간이 저장된 LocalDateTime 객체를 반환하는 정적메소드
		model.addAttribute("now2", LocalDateTime.now());

		model.addAttribute("price", "100000000");
		model.addAttribute("pi", "3.141592");
		
		return "result";
	}
	
	@GetMapping("/control")
	public String control(Model model) {
		model.addAttribute("gender", "M");
		model.addAttribute("age", 30);
		
		List<User> userList=new ArrayList<User>();
		userList.add(User.builder().id("abc123").name("홍길동").email("abc@itwll.xyz").build());
		userList.add(User.builder().id("opq456").name("임꺽정").email("opq@itwll.xyz").build());
		userList.add(User.builder().id("xyz789").name("전우치").email("xyz@itwll.xyz").build());
		model.addAttribute("userList", userList);
		
		return "control";
	}
	
	@GetMapping("/fragment")
	public String fragment() {
		return "fragment";
	}
	
	@GetMapping("/content1")
	public String content1() {
		return "content1";
	}
	
	@GetMapping("/content2")
	public String content2() {
		return "content2";
	}
}











