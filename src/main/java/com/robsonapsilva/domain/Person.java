package com.robsonapsilva.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

/**
 * Person class
 * 
 * @author robsonapsilva
 *
 */
@Entity
@Data
public class Person implements Serializable {

	private static final long serialVersionUID = 4802343462796879758L;

	@Id
	@SequenceGenerator(name = "PersonSeq", sequenceName = "PERSON_SEQ")
	@GeneratedValue(generator = "PersonSeq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(nullable = false, length = 100)
	private String fullName;

	@Column(nullable = false, length = 100, unique = true)
	private String email;
}
