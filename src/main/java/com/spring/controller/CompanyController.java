package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.BrandDAO;
import com.spring.dao.CompanyDAO;
import com.spring.domain.Brand;
import com.spring.domain.Company;

@Controller

public class CompanyController {
	
	@Autowired
	CompanyDAO cdao;
	@Autowired
	BrandDAO branddao;
	
	@RequestMapping("/")
	public ModelAndView saveCompany(@RequestParam(required=false) String companyName,@RequestParam(required=false) String brandName) {
		ModelAndView mv= new ModelAndView();
		Brand brand=new Brand();
		List<Brand> list = new ArrayList<Brand>();
		brand.setBrandName(brandName);
		list.add(brand);
		
		Company company =new Company();
		company.setCompanyName(companyName);
		company.setBrand(list);
		cdao.saveCompany(company);
		
		mv.setViewName("index");
		//mv.addObject(brand);
		mv.addObject(company);
		return mv;
		
	}
	
	@RequestMapping("/home")
	public ModelAndView listCompaines() {
		ModelAndView mv=new ModelAndView("home");
		List<Company> list=cdao.listCompanies();
		Company company=new Company();
		List<Brand> blist=branddao.listBrands();
		company.setBrand(blist);
		mv.addObject(cdao);
		return mv;
	}
	
}
