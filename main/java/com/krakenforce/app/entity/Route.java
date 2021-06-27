package com.krakenforce.app.entity;

import java.sql.Time;
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

import com.krakenforce.app.enums.Status;

@Entity
@Table(name = "route")
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "departure_station_id", nullable = false)
	private Station departureStation;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "destination_station_id", nullable = false)
	private Station destinationStation;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "train_id", nullable = false)
	private Train train;
	
	@Column(name = "departure_time")
	private Time departureTime;
	
	@Column(name = "destination_time")
	private Time destinationTime;
	
	@Column(name = "active")
	private Status active;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "route")
	private Set<TrainSchedule> trainSchedules = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Station getDepartureStation() {
		return departureStation;
	}

	public void setDepartureStation(Station departureStation) {
		this.departureStation = departureStation;
	}

	public Station getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(Station destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Time getDestinationTime() {
		return destinationTime;
	}

	public void setDestinationTime(Time destinationTime) {
		this.destinationTime = destinationTime;
	}

	public Status getActive() {
		return active;
	}

	public void setActive(Status active) {
		this.active = active;
	}

	public Set<TrainSchedule> getTrainSchedules() {
		return trainSchedules;
	}

	public void setTrainSchedules(Set<TrainSchedule> trainSchedules) {
		this.trainSchedules = trainSchedules;
	}
	
	
	
}
