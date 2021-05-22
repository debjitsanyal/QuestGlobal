package com.exp.commentary.model;

public class Commentary {
	
	private Matchinfo matchInfo;
	private Double currentBall;   // Example: 20.5 
	private BatsMan batsMan1;
	private BatsMan batsMan2;
	private String bowllerName;
	private Integer runTaken;
	private Integer totalRun;
	private String ballStatus;
	private String description;
	public Matchinfo getMatchInfo() {
		return matchInfo;
	}
	public void setMatchInfo(Matchinfo matchInfo) {
		this.matchInfo = matchInfo;
	}
	public Double getCurrentBall() {
		return currentBall;
	}
	public void setCurrentBall(Double currentBall) {
		this.currentBall = currentBall;
	}
	public BatsMan getBatsMan1() {
		return batsMan1;
	}
	public void setBatsMan1(BatsMan batsMan1) {
		this.batsMan1 = batsMan1;
	}
	public BatsMan getBatsMan2() {
		return batsMan2;
	}
	public void setBatsMan2(BatsMan batsMan2) {
		this.batsMan2 = batsMan2;
	}
	public String getBowllerName() {
		return bowllerName;
	}
	public void setBowllerName(String bowllerName) {
		this.bowllerName = bowllerName;
	}
	public Integer getRunTaken() {
		return runTaken;
	}
	public void setRunTaken(Integer runTaken) {
		this.runTaken = runTaken;
	}
	public Integer getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(Integer totalRun) {
		this.totalRun = totalRun;
	}
	public String getBallStatus() {
		return ballStatus;
	}
	public void setBallStatus(String ballStatus) {
		this.ballStatus = ballStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Commentary [matchInfo=" + matchInfo + ", currentBall=" + currentBall + ", batsMan1=" + batsMan1
				+ ", batsMan2=" + batsMan2 + ", bowllerName=" + bowllerName + ", runTaken=" + runTaken + ", totalRun="
				+ totalRun + ", ballStatus=" + ballStatus + ", description=" + description + "]";
	}
	
}
