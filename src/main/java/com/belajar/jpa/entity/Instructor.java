package com.belajar.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok
@Data //getter setter
@AllArgsConstructor //constructor argumens
@NoArgsConstructor //constructor no argumens

//JPA
@Entity
@Table(name = "instructor")
public class Instructor {
	
	@Id // primaryKey
	@GeneratedValue(strategy = GenerationType.IDENTITY) //generate automatis, autoi ncrement
	private long id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetail instructorDetail;

}
