package com.example;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController 
{
     @RequestMapping("/empform")
	 public ModelAndView showform()
     {   
    	 return new ModelAndView("empform","command",new Emp());
     } 
     
     @RequestMapping(value="/save",method=RequestMethod.POST)
     public ModelAndView save(@ModelAttribute("emp") Emp emp)
     {  
         Emp emp1=new Emp();
         emp1.setName(emp.getName());
         emp1.setSalary(emp.getSalary());
         emp1.setDesignation(emp.getDesignation());
	     System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());
	     Hiber hib=new Hiber();
	     hib.addemp(emp1);
	     return new ModelAndView("redirect:/viewemp");  
     }  
     
     @RequestMapping("/viewemp")  
     public ModelAndView viewemp()
     {  
    	 Hiber hib=new Hiber();
         List<Emp> list=hib.getlist();    
           
         return new ModelAndView("viewemp","list",list);  
     }  
     
}
