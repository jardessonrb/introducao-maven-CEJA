package br.com.cursojheat.introducaoMaven.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cursojheat.introducaoMaven.enums.StatusEmprestimoEnum;
import br.com.cursojheat.introducaoMaven.model.Emprestimo;
import br.com.cursojheat.introducaoMaven.model.Livro;

public class PesquisarLivro {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("introducaoMaven");
		EntityManager manager = managerFactory.createEntityManager();
				
		manager.getTransaction().begin();
		
		Livro livro =  manager.find(Livro.class, 19L);
		
		System.out.println("Livro: "+ livro.getId()+" nome : "+livro.getTitulo());
		livro.getEmprestimos().forEach(emprestimo -> System.out.println("emprestimo: "+emprestimo.getId()));
		manager.getTransaction().commit();
	}

}
