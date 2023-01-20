package com.ab.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.io.Serializable;

@Data @AllArgsConstructor @NoArgsConstructor
@Embeddable
public class ProgrammerProjId implements Serializable {
	private static final long serialVersionUID = 1L;
// here by using length properties we can control the length.
	//@Type(int)
	private Integer pid;
	private Integer projId;

}
