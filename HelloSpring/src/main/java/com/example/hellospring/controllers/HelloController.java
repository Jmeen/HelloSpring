package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

}
