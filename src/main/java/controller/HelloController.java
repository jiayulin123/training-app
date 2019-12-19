package controller;
/*
 * 基于SSM框架的第一个控制器
 * 1.添加@Controller
 * 2.方法添加映射路径
 * @author Jiayulin
 * @since jdk
 * */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("hi")
	@ResponseBody
    public String abc() {
		return "123";
	}
	@RequestMapping("jyl")
	@ResponseBody
	public String aaa(){
		
		return "jyltest";
		
		
	}
}
