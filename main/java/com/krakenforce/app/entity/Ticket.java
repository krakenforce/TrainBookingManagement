package com.krakenforce.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.krakenforce.app.enums.Status;

@Entity
@Table(name = "ticket")
public class Ticket {
	
	@Id
	private String id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "booking_id", nullable = false)
	private Booking booking;
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "active")
	private Status active;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Status getActive() {
		return active;
	}

	public void setActive(Status active) {
		this.active = active;
	}
	
	
}
