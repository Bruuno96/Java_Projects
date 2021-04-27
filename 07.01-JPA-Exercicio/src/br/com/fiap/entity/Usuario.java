package br.com.fiap.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="TB_USUARIO")
@SequenceGenerator(allocationSize = 1, name = "usuarioy", sequenceName = "SQ_TB_USUARIOY")
public class Usuario {
	
	@Id
	@Column(name = "cd_usuario", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarioy")
	private int cd_usuario;
	
	@Column(name = "nm_usuario", nullable = false, length = 60)
	private String nmUsuario;
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name="TB_ITEM_TESTE_USUARIO",
			   joinColumns = @JoinColumn(name="cd_usuario"), 
			   inverseJoinColumns = @JoinColumn(name="cd_item_teste"))
	private List<itemTeste> itens;
	
	
	public List<itemTeste> getItens() {
		return itens;
	}

	public void setItens(List<itemTeste> itens) {
		this.itens = itens;
	}

	public Usuario() {}

	// CRIAR
	public Usuario(String nmUsuario) {
		super();
		this.nmUsuario = nmUsuario;
	}
	
	// PESQUISAR
	public Usuario(int cd_usuario, String nmUsuario) {
		super();
		this.cd_usuario = cd_usuario;
		this.nmUsuario = nmUsuario;
	}
	
	

	public Usuario(String nmUsuario, List<itemTeste> itens) {
		super();
		this.nmUsuario = nmUsuario;
		this.itens = itens;
	}

	public int getCd_usuario() {
		return cd_usuario;
	}
	public void setCd_usuario(int cd_usuario) {
		this.cd_usuario = cd_usuario;
	}
	public String getNmUsuario() {
		return nmUsuario;
	}
	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}
	
	

}
