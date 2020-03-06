package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.BrandDAO;
import com.spring.domain.Brand;

@Controller
public class BrandController {
	
	@Autowired
	BrandDAO branddao;
	

	public ModelAndView listBrands() {
		ModelAndView mv=new ModelAndView("home");
		List<Brand> list=branddao.listBrands();
		mv.addObject(branddao);
		return mv;
	}
}
