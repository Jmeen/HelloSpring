package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// 타입 단독 맵핑 : 버전 5부터 사용하지 않는다.
@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	@ResponseBody
//	@RequestMapping
	public String list() {
		return "<h1>Guestbok : list</h1>";
	}

	@ResponseBody
//	@RequestMapping
	public String add() {
		return "<h1>GuestBook:add</h1>";
	}

}
