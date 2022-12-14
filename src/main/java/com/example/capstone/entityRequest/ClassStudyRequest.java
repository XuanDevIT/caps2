package com.example.capstone.entityRequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClassStudyRequest {
	
	private Long classStudyId;
	
	@JsonProperty("teacherId")
	private Long teacherId;
	
	@JsonProperty("className")
	private String className;
	
	@JsonProperty("subjectId")
	private Long subjectId;
	
}
