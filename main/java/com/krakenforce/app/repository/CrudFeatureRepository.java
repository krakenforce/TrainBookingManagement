package com.krakenforce.app.repository;

import java.util.List;

public interface CrudFeatureRepository<Type, IdType> {
	
	Type create(Type model);
	Type update(Type model);
	int delete(int modelId);
	
	List<Type> GetAll();
	Type GetById(IdType id);
	
}
