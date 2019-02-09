package com.sda.gymmanagementhibernatespring.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registrations")
public class RegistrationsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "registration_no")
	private int registrationsNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schedule_id")
	private ScheduleEntity scheduleEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "client_id")
	private ClientEntity clientEntity;

	public int getRegistrationsNumber() {
		return registrationsNumber;
	}

	public void setRegistrationsNumber(int registrationsNumber) {
		this.registrationsNumber = registrationsNumber;
	}

	public ScheduleEntity getScheduleType() {
		return scheduleEntity;
	}

	public void setScheduleType(ScheduleEntity scheduleType) {
		this.scheduleEntity = scheduleType;
	}

	public ClientEntity getClientEntity() {
		return clientEntity;
	}

	public void setClientEntity(ClientEntity clientEntity) {
		this.clientEntity = clientEntity;
	}

}
