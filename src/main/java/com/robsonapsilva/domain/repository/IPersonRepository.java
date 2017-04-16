package com.robsonapsilva.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robsonapsilva.domain.Person;

/**
 * Interface with the methods of access to the repository. This interface
 * extends JpaRepository.
 * 
 * @author robsonapsilva
 *
 */
@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {
}
