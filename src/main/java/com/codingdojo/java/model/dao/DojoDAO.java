package com.codingdojo.java.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.codingdojo.java.model.Dojo;

@Repository
@Transactional
public interface DojoDAO extends CrudRepository<Dojo, Integer> {

}
