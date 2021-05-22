package com.exp.commentary.model;

import java.util.Date;

public class Matchinfo {
	
	private Integer matchId;
	private Date matchDate;
	private String vanue;
	private String city;
	private String country;
	private String firatTeamName;
	private String secondTeamName;
	private String kafkaTopic;
	public Integer getMatchId() {
		return matchId;
	}
	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public String getVanue() {
		return vanue;
	}
	public void setVanue(String vanue) {
		this.vanue = vanue;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFiratTeamName() {
		return firatTeamName;
	}
	public void setFiratTeamName(String firatTeamName) {
		this.firatTeamName = firatTeamName;
	}
	public String getSecondTeamName() {
		return secondTeamName;
	}
	public void setSecondTeamName(String secondTeamName) {
		this.secondTeamName = secondTeamName;
	}
	public String getKafkaTopic() {
		return kafkaTopic;
	}
	public void setKafkaTopic(String kafkaTopic) {
		this.kafkaTopic = kafkaTopic;
	}
	@Override
	public String toString() {
		return "Matchinfo [matchId=" + matchId + ", matchDate=" + matchDate + ", vanue=" + vanue + ", city=" + city
				+ ", country=" + country + ", firatTeamName=" + firatTeamName + ", secondTeamName=" + secondTeamName
				+ ", kafkaTopic=" + kafkaTopic + "]";
	}
	

}
