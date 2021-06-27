package com.krakenforce.app.entity;

import java.sql.Date;
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

import com.krakenforce.app.enums.PaymentType;
import com.krakenforce.app.enums.Status;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "schedule_id", nullable = false)
	private TrainSchedule trainSchedule;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cart_id", nullable = true)
	private Cart cart;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "seat_id", nullable = false)
	private Seat seat;
	
	@Column(name = "create_datetime")
	private Date createDatetime;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_type_id", nullable = false)
	private CustomerType customerType;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "identifier_number")
	private String identifierNumber;
	
	@Column(name = "final_price")
	private float finalPrice;
	
	@Column(name = "payment_type")
	private PaymentType paymentType;
	
	@Column(name = "active")
	private Status active;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "booking")
	private Set<Ticket> tickets = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TrainSchedule getTrainSchedule() {
		return trainSchedule;
	}

	public void setTrainSchedule(TrainSchedule trainSchedule) {
		this.trainSchedule = trainSchedule;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdentifierNumber() {
		return identifierNumber;
	}

	public void setIdentifierNumber(String identifierNumber) {
		this.identifierNumber = identifierNumber;
	}

	public float getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(float finalPrice) {
		this.finalPrice = finalPrice;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public Status getActive() {
		return active;
	}

	public void setActive(Status active) {
		this.active = active;
	}

	public Set<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
}
