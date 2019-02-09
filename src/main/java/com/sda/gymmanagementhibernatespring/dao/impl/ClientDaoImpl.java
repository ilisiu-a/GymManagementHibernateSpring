package com.sda.gymmanagementhibernatespring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sda.gymmanagementhibernatespring.dao.ClientDao;
import com.sda.gymmanagementhibernatespring.dao.entities.ClientEntity;

@Repository
public class ClientDaoImpl implements ClientDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveClient(ClientEntity client) {
	}

	public List<ClientEntity> getAllClients() {
		Query<ClientEntity> query = sessionFactory.getCurrentSession().createQuery("from ClientEntity");
		return query.list();
	}

}
