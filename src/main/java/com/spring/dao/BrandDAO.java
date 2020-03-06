package com.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.Brand;

@Transactional
@Repository
public class BrandDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean saveBrand(Brand brandIns) {
		Session session = this.sessionFactory.getCurrentSession();
		if (session.save(brandIns) != null) {
			return true;
		}
		else
			return false;
	}

	public List<Brand> listBrands() {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria ct = session.createCriteria(Brand.class);
		List<Brand> blist = ct.list();
		return blist;

	}

	public Brand getBrandById(Integer brandId) {
		Session session = this.sessionFactory.getCurrentSession();
		Brand brandIns = (Brand) session.get(Brand.class, brandId);
		return brandIns;
	}
}
