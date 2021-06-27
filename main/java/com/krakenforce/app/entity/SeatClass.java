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
@Table(name = "seat_class")
public class SeatClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surcharge_percentage")
	private int surchargePercentage;
	
	@Column(name = "active")
	private Status active;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seatClass")
	private Set<Seat> seats = new HashSet<>();

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

	public int getSurchargePercentage() {
		return surchargePercentage;
	}

	public void setSurchargePercentage(int surchargePercentage) {
		this.surchargePercentage = surchargePercentage;
	}

	public Status getActive() {
		return active;
	}

	public void setActive(Status active) {
		this.active = active;
	}

	public Set<Seat> getSeats() {
		return seats;
	}

	public void setSeats(Set<Seat> seats) {
		this.seats = seats;
	}
	
	
}
