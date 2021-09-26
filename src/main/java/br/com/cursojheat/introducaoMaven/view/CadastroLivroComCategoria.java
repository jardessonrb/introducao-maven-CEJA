package br.com.cursojheat.introducaoMaven.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cursojheat.introducaoMaven.model.Categoria;
import br.com.cursojheat.introducaoMaven.model.Livro;

public class CadastroLivroComCategoria {
	
	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("introducaoMaven");
		EntityManager entityManager = managerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Categoria categoria = entityManager.find(Categoria.class, 16L);		
		
		System.out.println("Categoria do find: "+categoria);
		
		Livro livro =  new Livro();
		livro.setAnoPublicacao(2010);
		livro.setTitulo("Teste sem construtor");
		livro.setCategoria(categoria);
		
		entityManager.persist(livro);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
	
	
}
