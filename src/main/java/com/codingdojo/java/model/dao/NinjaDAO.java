package com.codingdojo.java.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.codingdojo.java.model.Ninja;

@Repository
@Transactional
public interface NinjaDAO extends CrudRepository<Ninja, Integer> {

}
