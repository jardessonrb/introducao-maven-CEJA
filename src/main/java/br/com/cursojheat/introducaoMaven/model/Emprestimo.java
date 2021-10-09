package br.com.cursojheat.introducaoMaven.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.cursojheat.introducaoMaven.enums.StatusEmprestimoEnum;


@Entity
@Table(name = "emprestimos")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Enumerated(EnumType.STRING)
	private StatusEmprestimoEnum status;
	
	@ManyToMany
	@JoinTable(name = "emprestimos_livros", 
		joinColumns = {@JoinColumn(name = "emprestimo_id")},
		inverseJoinColumns = {@JoinColumn(name = "livro_id")})
	private List<Livro> listaLivros;
	
	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	public StatusEmprestimoEnum getStatus() {
		return status;
	}
	
	public void setStatus(StatusEmprestimoEnum status) {
		this.status = status;
	}
	
	public List<Livro> getListaLivros() {
		return listaLivros;
	}
	
	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
	
	
}
