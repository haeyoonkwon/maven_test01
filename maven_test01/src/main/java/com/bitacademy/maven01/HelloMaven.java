package com.bitacademy.maven01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("hello")
public class HelloMaven {
@RequestMapping("hello.do")
public String hello(){
	return "hello.jsp";
}
}
