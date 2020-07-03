package com.codingdojo.java.model.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.codingdojo.java.model.Ninja;

public interface NinjaPaginationDAO extends PagingAndSortingRepository<Ninja, Integer> {

}
