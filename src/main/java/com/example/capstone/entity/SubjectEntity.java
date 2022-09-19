package com.example.capstone.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Subject")
public class SubjectEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subjectID;
	private String subjectName;

//	@OneToMany(mappedBy="subjectEntity")
//    private Set<ClassStudyEntity> classStudyEntity;
	@OneToMany(mappedBy = "Subject")
	private List<TimeStudyEntity> timesStudyEntity;

}