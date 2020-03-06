package com.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.Company;

@Transactional
@Repository
public class CompanyDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Company> listCompanies(){
		Session session=this.sessionFactory.getCurrentSession();
        Criteria ct=session.createCriteria(Company.class);
        List<Company> clist=ct.list();
        return clist;
	}
    public boolean saveCompany(Company companyIns){
    	Session session=this.sessionFactory.getCurrentSession();
        if(session.save(companyIns)!=null) {
        	return true;
        }
        return false;
    }
}
