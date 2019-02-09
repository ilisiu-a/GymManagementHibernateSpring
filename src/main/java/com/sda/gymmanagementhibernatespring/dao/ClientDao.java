package com.sda.gymmanagementhibernatespring.dao;

import java.util.List;

import com.sda.gymmanagementhibernatespring.dao.entities.ClientEntity;

public interface ClientDao {
	public void saveClient(ClientEntity client);

	public List<ClientEntity> getAllClients();
}
