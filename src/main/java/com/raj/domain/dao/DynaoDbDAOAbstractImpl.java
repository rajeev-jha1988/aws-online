package com.raj.domain.dao;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;


/**
 * Abstract class implementing UnivDAO<T, E> interface, generic methods which
 * were to be defined in each class implementing the UnivDAO<T, E> interface
 * have been defined here. Classes extending this abstract class need to provide
 * the autowired HibernateUtil object and the respective hibernate Model class.
 * 
 * @param <T>
 *            Model class
 * @param <E>
 *            Primary key class
 * 
 *  @author whiteTiger
 * 
 */

public abstract class DynaoDbDAOAbstractImpl<T, E extends Serializable> implements	DynamoDbUniDAO<T, E> {

	private static final long serialVersionUID = -3898701016758227547L;

	/**
	 * Accessor method for hibernateUtil
	 * 
	 * @return Autowired HibernateUtil object
	 */
	
	@Autowired
	private DynamoDBMapper entityManager;


	/**
	 * Accessor method for Model class
	 * 
	 * @return Respective Model class
	 */
	protected abstract Class<T> getModelClass();

	@Override
	public void createUpdateItem(T model) {
		 entityManager.save(model);
	}
	
	
	@Override
	public void createUpdateItem(T model,SaveBehavior saveBehavior){
		DynamoDBMapperConfig dynamoDBMapperConfig= DynamoDBMapperConfig.builder().withSaveBehavior(saveBehavior).build();
		entityManager.save(model, SaveBehavior.UPDATE.config());
	}
	

	@Override
	public void deleteItem(T model) {
		entityManager.delete(model);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll(int fetchSize, int fetchCount) {
		List<T> returnList = new ArrayList<T>();
		DynamoDBQueryExpression dbQueryExpression = new DynamoDBQueryExpression<T>();
		dbQueryExpression.withLimit(fetchCount*fetchCount);
		
		 entityManager.queryPage(getModelClass(), dbQueryExpression);
		return returnList;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T findByPartitionKey(E pk) {
		T returnModel = null;
		returnModel =(T) entityManager.load(getModelClass(), pk);
		return returnModel;
	}
	
	@Override
	public T findByPartitionRangeKey(E pk, E rangeKey) {
		T returnModel = null;
		returnModel =(T) entityManager.load(getModelClass(), pk,rangeKey);
		return returnModel;
	}
}

