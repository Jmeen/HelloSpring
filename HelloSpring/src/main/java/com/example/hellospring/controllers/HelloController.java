package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

// 메서드 단독 맵핑
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam String name) {
		ModelAndView mav = new ModelAndView();

		// 객체 추가 : servlet에서 addAttribute의 역할
		mav.addObject("message", // 키
				"Hello," + name); // 값

		// 뷰 파일을 연결 : 서블릿에서 RequestDispatcher로 포워드 한 것과 비슷
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}

	// 문자열을 반환하면 해당 뷰로의 포워딩을 반환한다.
	@RequestMapping("/hello2")
	public String hello2() {

		return "/WEB-INF/views/hello.jsp";
	}

	// 문자열을 반환할떄 직접 응답으로 전송하고 싶을 때
	// ResponseBody -> MessageConverter를 실행하는 어노테이션
	@ResponseBody
	@RequestMapping("/hello3")
	public String hello3() {
		return "<h1>문자열 직접 전송</h1>";
	}
}
