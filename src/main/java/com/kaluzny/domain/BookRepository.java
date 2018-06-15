package com.kaluzny.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/*@RepositoryRestResource
public interface BookRepository extends MongoRepository<Book, Integer> {
}*/

public interface BookRepository extends CrudRepository<Book, Integer> {
	
	/*@Override
	Book findOne(int id);
	
	@Override
	void delete(int id);*/
}