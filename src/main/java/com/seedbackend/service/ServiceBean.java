package com.seedbackend.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.seedbackend.model.Indice;

public class ServiceBean  implements Serializable{
	private static final long serialVersionUID = 1L;

	public ServiceBean() {
		super();

	}

	public List<Indice> bouchonDonnees () {
		List <Indice> liste = new ArrayList <Indice>();
		Indice  indice1, indice2, indice3,indice4,indice5,indice6, indice7;
		indice1 = new Indice("1", "A1", "A1", "C1", "D4", "15", "15", "15", "15");
		indice2 = new Indice("2", "A2", "A2", "C2", "D2", "22", "22", "22", "22");
		indice3 = new Indice("3", "A3", "A3", "C3", "D3", "33", "33", "33", "33");
		indice4 = new Indice("4", "A4", "A4", "C4", "D4", "15", "15", "15", "15");
		indice5 = new Indice("5", "A5", "A5", "C5", "D5", "15", "15", "15", "15");
		indice6 = new Indice("6", "A6", "A6", "C6", "D6", "15", "15", "15", "15");
		indice7 = new Indice("7", "A7", "A7", "C7", "D7", "15", "15", "15", "15");

		liste.add(indice1);
		liste.add(indice2);
		liste.add(indice3);
		liste.add(indice4);
		liste.add(indice5);
		liste.add(indice6);
		liste.add(indice7);

		return liste;

	}
}
