package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	// 파라미터 받아오기
	@RequestMapping("/")
//	public ModelAndView home(@RequestParam("name") String name) {
	public ModelAndView home(@RequestParam(value = "name", required = false, defaultValue = "anonymous") String name) {
//		파라미터의 필수 여부와 기본값을 지정할 수 있다.

		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello, " + name);
		mav.setViewName("/WEB-INF/views/welcome.jsp");
		return mav;
	}
}
