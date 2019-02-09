package com.sda.gymmanagementhibernatespring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sda.gymmanagementhibernatespring.dao.ClientDao;
import com.sda.gymmanagementhibernatespring.dao.entities.ClientEntity;
import com.sda.gymmanagementhibernatespring.service.ClientService;

@Service
@Transactional(readOnly = true)
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;

	@Transactional(readOnly = false)
	public void saveClient(ClientEntity clientEntity) {
		clientDao.saveClient(clientEntity);
	}

	@Transactional
	public List<ClientEntity> getAllClients() {
		return clientDao.getAllClients();
	}

	public ClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}
}
