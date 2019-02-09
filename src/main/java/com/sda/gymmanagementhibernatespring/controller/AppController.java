package com.sda.gymmanagementhibernatespring.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sda.gymmanagementhibernatespring.dao.entities.ClientEntity;
import com.sda.gymmanagementhibernatespring.service.ClientService;
import com.sda.gymmanagementhibernatespring.service.impl.ClientServiceImpl;

public class AppController {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("database.xml");
		ClientService clientService = applicationContext.getBean(ClientService.class);
		List<ClientEntity> clients = clientService.getAllClients();
		for (ClientEntity clientEntity : clients) {
			System.out.println(clientEntity.getFirstName() + " | " + clientEntity.getLastName()+"->"+clientEntity.getPhone());
		}
	}
}
