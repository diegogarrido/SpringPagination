package com.codingdojo.java.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingdojo.java.model.Ninja;

@Service
@Transactional
public class NinjaService {

	@Autowired
	NinjaPaginationDAO ninjaRepo;

	private static final int PAGE_SIZE = 5;

	public Page<Ninja> ninjasPerPage(int pageNumber) {
		PageRequest pageRequest = PageRequest.of(pageNumber, PAGE_SIZE, Direction.ASC, "dojo.name");
		return ninjaRepo.findAll(pageRequest);
	}
}
