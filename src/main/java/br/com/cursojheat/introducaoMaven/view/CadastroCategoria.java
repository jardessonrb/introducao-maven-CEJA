package br.com.cursojheat.introducaoMaven.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cursojheat.introducaoMaven.model.Categoria;

public class CadastroCategoria {
	public static void main(String[] args) {
		Categoria categoria = new Categoria();
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("introducaoMaven");
		EntityManager entityManager = managerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();
		
		entityManager.close();
	}
}	
