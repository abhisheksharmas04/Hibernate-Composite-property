package com.ab.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "PROGRAMMER_PROJECT_INFO")
public class ProgrammerProjectInfo {
	@EmbeddedId
	private ProgrammerProjId id; // Has a property
	@Column(name = "PERSON_NAME", length = 20)
	private String personName;
	@Column(name = "PROJECT_NAME", length = 20)
	private String projName;
	@Column(name = "TEAM_SIZE")
	private Integer teamSize;
}
