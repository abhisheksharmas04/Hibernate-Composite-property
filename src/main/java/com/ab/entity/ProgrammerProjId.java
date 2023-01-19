package com.ab.entity;

import java.io.Serializable;

public class ProgrammerProjId implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer pid;
	private Integer projId;

	public ProgrammerProjId() {
	}

	public ProgrammerProjId(Integer pid, Integer projId) {
		super();
		this.pid = pid;
		this.projId = projId;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

}
