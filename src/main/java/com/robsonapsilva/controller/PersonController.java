package com.robsonapsilva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.robsonapsilva.domain.Person;
import com.robsonapsilva.service.PersonService;

/**
 * class to map endpoint's
 * 
 * @author robsonapsilva
 *
 */
@RestController
@RequestMapping("/api/persons")
public class PersonController {

	@Autowired
	private PersonService personService;

	/**
	 * Get all persons
	 * 
	 * @param pageable
	 *            Pageable interface to define number of elements per page and
	 *            actual page
	 * @return {@code HttpEntity<Page<Person>>}
	 */
	@RequestMapping(value = { "", "/" }, method = RequestMethod.GET)
	public HttpEntity<Page<Person>> findAll(@PageableDefault Pageable pageable) {
		return ResponseEntity.ok(personService.findAll(pageable));
	}

	/**
	 * Get person by id
	 * 
	 * @param id
	 *            Long variable to find specific person
	 * @return {@code HttpEntity<Person>}
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public HttpEntity<Person> findById(@PathVariable Long id) {
		Person person = personService.findById(id);
		if (person == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(person);
	}

}
