package com.krakenforce.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.krakenforce.app.enums.CarType;

@Entity
@Table(name = "carriage")
public class Carriage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "car_number")
	private int carNumber;
	
	@Column(name = "car_type")
	private CarType carType;
	
	@Column(name = "seat_floor_price")
	private float seatFloorPrice;
	
	@Column(name = "seat_amount")
	private int seatAmount;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "train_id", nullable = false)
	private Train train;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "carriage")
	private Set<Seat> seats = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public float getSeatFloorPrice() {
		return seatFloorPrice;
	}

	public void setSeatFloorPrice(float seatFloorPrice) {
		this.seatFloorPrice = seatFloorPrice;
	}

	public int getSeatAmount() {
		return seatAmount;
	}

	public void setSeatAmount(int seatAmount) {
		this.seatAmount = seatAmount;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Set<Seat> getSeats() {
		return seats;
	}

	public void setSeats(Set<Seat> seats) {
		this.seats = seats;
	}
	
	
}
