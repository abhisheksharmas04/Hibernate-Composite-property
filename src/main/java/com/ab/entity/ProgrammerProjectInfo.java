package com.ab.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PROGRAMMERS_PROJECT_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammerProjectInfo {
	@EmbeddedId
	private ProgrammerProjId id; // Has a property
	@Column(length = 20)
	private String pname;
	@Column(length = 20)
	private String projName;
	private Integer teamSize;

}
