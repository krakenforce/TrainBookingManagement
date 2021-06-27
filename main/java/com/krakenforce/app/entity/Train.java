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
@Table(name = "train")
public class Train {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "active")
	private Status active;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "train")
	private Set<Carriage> carriages = new HashSet<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "train")
	private Set<Route> routes = new HashSet<>();

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

	public Status getActive() {
		return active;
	}

	public void setActive(Status active) {
		this.active = active;
	}

	public Set<Carriage> getCarriages() {
		return carriages;
	}

	public void setCarriages(Set<Carriage> carriages) {
		this.carriages = carriages;
	}

	public Set<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(Set<Route> routes) {
		this.routes = routes;
	}
	
	
}
