package com.raj.domain.dao;


import java.io.Serializable;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;


/**
 * @author whiteTiger
 * 
 */

public interface DynamoDbUniDAO<T, E> extends Serializable {

	/**
	 * Generic method to create a tuple corresponding to the model
	 * 
	 * @param model
	 *            Model object
	 * @return Primary key of the created tuple
	 */
	void createUpdateItem(T model);
	void createUpdateItem(T model,SaveBehavior saveBehavior);

	/**
	 * Generic method to update a tuple corresponding to the model
	 * 
	 * @param model
	 *            Model object
	 */
	void updateItem(T model);

	/**
	 * Generic method to delete a tuple corresponding to the model
	 * 
	 * @param model
	 *            Model object
	 */
	void deleteItem(T model);

	/**
	 * Generic method to get models(tuples) based on fetchSize & fetchCount
	 * 
	 * @param fetchSize
	 *            Number of tuples to be fetched in a count
	 * @param fetchCount
	 *            Count of the fetch
	 * @return List of models(tuples) which have been fetched
	 */
	List<T> findAll(int fetchSize, int fetchCount);

	/**
	 * Generic method to get a model(tuple) based on primary key
	 * 
	 * @param pk
	 *            Primary key of the model
	 * @return Model(tuple) corresponding to the primary key
	 */
	T findByPartitionKey(E pk);
	
	T findByPartitionRangeKey(E pk,E rangeKey);


}
