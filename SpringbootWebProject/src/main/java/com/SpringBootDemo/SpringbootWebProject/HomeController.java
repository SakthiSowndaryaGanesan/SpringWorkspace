package com.SpringBootDemo.SpringbootWebProject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    //Using model attribute in method
    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }


    //jsp method to use the datas

//    @RequestMapping("add")
//
//    public String add(HttpServletRequest req, HttpSession session){
//
//       int Number1 = Integer.parseInt(req.getParameter("Number1"));
//       int Number2 = Integer.parseInt(req.getParameter("Number2"));
//       int result = Number1+Number2;
//
//       session.setAttribute("result" , result);
//
//       System.out.println(result);
//       return "result.jsp";



    //ModelandView code
    @RequestMapping("add" )
    public ModelAndView add(@RequestParam("Number1") int Number1 , @RequestParam("Number2") int Number2 , ModelAndView mv) {

        int result = Number1 + Number2;
        System.out.println(result);
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

//    @RequestMapping("addStudents" )
//    public ModelAndView addStudents(@RequestParam("sid") int sid , @RequestParam("sname") String sname , ModelAndView mv){
//
//        Students std = new Students();
//        std.setSid(sid);
//        std.setSname(sname);
//
//        mv.addObject("std" , std);
//        mv.setViewName("result");
//        return mv;


    //using model attribute
   @RequestMapping("addStudents")
    public String addStudents(@ModelAttribute("student1") Students std){
        return "result";

    }
}
