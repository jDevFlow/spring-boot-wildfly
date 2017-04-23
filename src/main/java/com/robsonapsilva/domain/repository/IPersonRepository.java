package com.robsonapsilva.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robsonapsilva.domain.Person;

/**
 * Interface with the methods of access to the repository, will be accessed by
 * service. This interface extends JpaRepository.
 * 
 * @author robsonapsilva
 *
 * @see PersonService
 * @see JpaRepository
 *
 */
@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {
}
