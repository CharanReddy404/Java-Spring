package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CoursesController {
	
	@RequestMapping("/courses")
	public ModelAndView courses(@RequestParam("cname")
			String coursename) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("cName", coursename);
		mv.setViewName("course");
		return mv;
	}
	
//	@RequestMapping("/courses")
//	public String courses(@RequestParam("cname")
//			String coursename, HttpSession session) {
//		
//		session.setAttribute("cName", coursename);
//		return "course";
//	}
	
//	@RequestMapping("/courses")
//	public String courses(HttpServletRequest req) {
//		HttpSession session = req.getSession();
//		System.out.println("Welcome to Spring Boot..");
//		String cName = req.getParameter("cname");
//		System.out.println("The Course name is: "+cName);
//		session.setAttribute("cName", cName);
//		return "course";
//	}
}
