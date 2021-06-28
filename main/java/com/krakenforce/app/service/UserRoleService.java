package com.krakenforce.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.krakenforce.app.entity.UserRole;
import com.krakenforce.app.repository.CrudFeatureRepository;
import com.krakenforce.app.repository.UserRoleRepository;

public class UserRoleService implements CrudFeatureRepository<UserRole, Integer> {
	
	@Autowired
	UserRoleRepository repository;

	@Override
	public UserRole create(UserRole model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole update(UserRole model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int modelId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserRole> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole GetById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
