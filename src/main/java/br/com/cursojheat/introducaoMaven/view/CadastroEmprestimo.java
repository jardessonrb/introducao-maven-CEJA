package br.com.cursojheat.introducaoMaven.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cursojheat.introducaoMaven.enums.StatusEmprestimoEnum;
import br.com.cursojheat.introducaoMaven.model.Emprestimo;
import br.com.cursojheat.introducaoMaven.model.Livro;

public class CadastroEmprestimo {
	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("introducaoMaven");
		EntityManager manager = managerFactory.createEntityManager();
				
		manager.getTransaction().begin();
		Livro livro1 = manager.find(Livro.class, 17L);
		Livro livro2 = manager.find(Livro.class, 19L);
		
		List<Livro> listaLivrosEmprestados =  new ArrayList<Livro>();
		
//		listaLivrosEmprestados.add(livro1);
		listaLivrosEmprestados.add(livro2);
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setListaLivros(listaLivrosEmprestados);
		emprestimo.setStatus(StatusEmprestimoEnum.ATIVO);
		
		
		manager.persist(emprestimo);
		manager.getTransaction().commit();
	}
}
