package com.ab.entity;

public class ProgrammerProjectInfo {
	private ProgrammerProjId id; // Has a property
	private String pname;
	private String projName;
	private Integer teamSize;

	public ProgrammerProjectInfo() {
	}

	public ProgrammerProjectInfo(ProgrammerProjId id, String pname, String projName, Integer teamSize) {
		super();
		this.id = id;
		this.pname = pname;
		this.projName = projName;
		this.teamSize = teamSize;
	}

	public ProgrammerProjId getId() {
		return id;
	}

	public void setId(ProgrammerProjId id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

}
