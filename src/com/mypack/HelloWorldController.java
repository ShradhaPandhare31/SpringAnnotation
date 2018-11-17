package com.mypack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello2")
	public ModelAndView helloWorld2()
	{
		System.out.println("Test ");
		return new ModelAndView("display");
		
	}

}
