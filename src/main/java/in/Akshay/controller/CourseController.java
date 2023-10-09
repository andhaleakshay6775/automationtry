package in.Akshay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class CourseController {

	@GetMapping("/Course")
	@ResponseBody
	public String coursedtl(String cname, String Trainer) {
		
		String msg = cname+"By "+Trainer+" starting from 23 / jun/2021";
		
		return msg;
		
	}
}
