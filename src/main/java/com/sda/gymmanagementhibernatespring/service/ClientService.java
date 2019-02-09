package com.sda.gymmanagementhibernatespring.service;

import java.util.List;

import com.sda.gymmanagementhibernatespring.dao.entities.ClientEntity;

public interface ClientService {

	public void saveClient(ClientEntity client);

	public List<ClientEntity> getAllClients();
}
