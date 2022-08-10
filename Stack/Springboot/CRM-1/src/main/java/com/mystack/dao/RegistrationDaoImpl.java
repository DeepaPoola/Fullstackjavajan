package com.mystack.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mystack.model.CustomerBean;

@Repository
public class RegistrationDaoImpl implements IRegistrationDao {
	
	@Autowired
	JdbcTemplate jt;
	
	
	public boolean saveCustomer(CustomerBean customerBean) {
		// TODO Auto-generated method stub
		System.out.println(customerBean);
		String sqlcommand = "insert into UserTwo values(?,?,?,?)";
		jt.update(sqlcommand, customerBean.getFirstName(),customerBean.getEmail(),customerBean.getMobile(),customerBean.getPassword());
		return true;
	}

}
