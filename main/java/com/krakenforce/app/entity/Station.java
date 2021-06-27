package com.krakenforce.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.krakenforce.app.enums.Status;

@Entity
@Table(name = "station")
public class Station {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "active")
	private Status active;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departureStation")
	private Set<Route> departureRoutes = new HashSet<>(); 
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "destinationStation")
	private Set<Route> detinationRoutes = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Status getActive() {
		return active;
	}

	public void setActive(Status active) {
		this.active = active;
	}

	public Set<Route> getDepartureRoutes() {
		return departureRoutes;
	}

	public void setDepartureRoutes(Set<Route> departureRoutes) {
		this.departureRoutes = departureRoutes;
	}

	public Set<Route> getDetinationRoutes() {
		return detinationRoutes;
	}

	public void setDetinationRoutes(Set<Route> detinationRoutes) {
		this.detinationRoutes = detinationRoutes;
	} 
	
	
}
