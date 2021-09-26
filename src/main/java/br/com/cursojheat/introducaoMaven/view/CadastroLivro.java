package br.com.cursojheat.introducaoMaven.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cursojheat.introducaoMaven.model.Livro;

public class CadastroLivro {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("introducaoMaven");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(livro);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
