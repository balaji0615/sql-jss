package com.Polyt.EmpDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Polyt.EmpDemo.model.Edemo;
import com.Polyt.EmpDemo.repository.EmRepo;

@Controller
public class EController {
	
	@Autowired
	EmRepo emrepo;

	@RequestMapping("index")
	 public String index() {
		 return "index.jsp";
	 }
	@RequestMapping("addEmp")
	public String addEmp(Edemo edemo)
	{
		emrepo.save(edemo);
		return "index.jsp";
	}
	@RequestMapping("getEmp")
	public ModelAndView getEmp(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("disemply.jsp");
		Edemo edemo=emrepo.findById(id).orElse(new Edemo());
		mv.addObject(edemo);
		return mv;
	}
	@RequestMapping("deleteEmp")
	public ModelAndView deleteEmp(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("delemply.jsp");
		Edemo edemo=emrepo.findById(id).orElse(new Edemo());
		emrepo.deleteById(id);
		mv.addObject(edemo);
		return mv;
	}
	
}
