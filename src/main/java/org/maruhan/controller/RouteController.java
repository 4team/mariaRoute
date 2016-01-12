package org.maruhan.controller;

import org.maruhan.domain.RouteVO;
import org.maruhan.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/route/*")
public class RouteController{
	
	@Autowired
	RouteService service;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public void createRoute(RouteVO vo) throws Exception{
		service.regist(vo);
	}
	
	@RequestMapping(value="/view", method = RequestMethod.GET)
	public void view(@RequestParam Integer routeno,Model model) throws Exception{
		RouteVO vo = service.view(routeno);
		model.addAttribute("ROUTE", vo);
	}

}
