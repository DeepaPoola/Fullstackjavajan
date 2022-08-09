package com.mystack.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mystack.dao.ITestDao;

@Repository
public class TestDaoImpl implements ITestDao{
   
	
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void insertRecords() {
		// TODO Auto-generated method stub
		jt.update("insert into emp values(10,'Sunny',50000)");
		jt.update("insert into emp values(20,'Deepa',45000)");
		jt.update("insert into emp values(30,'Nallapu',60000)");
		jt.update("insert into emp values(40,'Poola',70000)");
				
		
	}

	@Override
	public List selectRecords() {
		// TODO Auto-generated method stub
		return jt.queryForList("select * from emp");
	}

	@Override
	public int noOfEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}

}
