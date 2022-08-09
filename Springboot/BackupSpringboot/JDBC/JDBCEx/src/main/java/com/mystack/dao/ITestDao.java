package com.mystack.dao;

import java.util.List;

public interface ITestDao {
       void insertRecords();
       List selectRecords();
       int noOfEmployee();
       public default void m1() {
    	   System.out.println("Default Method");
       }
}
