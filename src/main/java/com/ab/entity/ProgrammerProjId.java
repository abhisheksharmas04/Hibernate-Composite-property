package com.ab.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammerProjId implements Serializable {
	private static final long serialVersionUID = 1L;

	//@Type(type="int") -- to tell hibernate to use his predefined dataypes
	private Integer pid;
	private Integer projId;
}
