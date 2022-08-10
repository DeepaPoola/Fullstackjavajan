package com.mystack.dao;

import com.mystack.model.CustomerBean;

public interface IRegistrationDao {
  public boolean saveCustomer(CustomerBean customerBean);
}
