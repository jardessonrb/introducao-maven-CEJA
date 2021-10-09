package br.com.cursojheat.introducaoMaven.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cursojheat.introducaoMaven.model.Emprestimo;
import br.com.cursojheat.introducaoMaven.model.Livro;

public class PesquisarEmprestimos {
	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("introducaoMaven");
		EntityManager manager = managerFactory.createEntityManager();
				
		manager.getTransaction().begin();
		
		Emprestimo emprestimo = manager.find(Emprestimo.class, 20L);
		System.out.println("Emprestimo: "+emprestimo.getId()+" "+emprestimo.getStatus());
		
		emprestimo.getListaLivros().forEach(livro -> System.out.println(livro.getTitulo()));
		
		manager.getTransaction().commit();
	}
}
