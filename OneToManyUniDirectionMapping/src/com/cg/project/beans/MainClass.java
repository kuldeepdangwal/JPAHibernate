package com.cg.project.beans;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}
}
