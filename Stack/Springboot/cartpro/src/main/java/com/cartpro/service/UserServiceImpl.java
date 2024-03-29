package com.cartpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

import com.cartpro.model.User;
import com.cartpro.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	
	
	
	@Autowired
	private UserRepository userRepo;
	
	
	//It will be provided on WebSecurityConfig as @Bean
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	public User saveUser(final User user) {
		// TODO Auto-generated method stub
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}
	//Test Case
	@Override
	public User updateUser(final User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long numberOfUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
