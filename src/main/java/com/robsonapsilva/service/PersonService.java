package com.robsonapsilva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.robsonapsilva.domain.Person;
import com.robsonapsilva.domain.repository.IPersonRepository;

/**
 * Class to broker the controller access to the repository.
 *
 * @author robsonapsilva
 * 
 * @see IPersonRepository
 */
@Service
public class PersonService {

	@Autowired
	private IPersonRepository repository;

	/**
	 * Get person by id
	 * 
	 * @param id
	 *            Long variable to find specific person
	 * @return {@code Person}
	 */
	public Person findById(Long id) {
		return repository.findOne(id);
	}

	/**
	 * Get all persons
	 * 
	 * @param pageable
	 *            Pageable interface to define number of elements per page and
	 *            actual page
	 * @return {@code Page<Person>}
	 */
	public Page<Person> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}
}
