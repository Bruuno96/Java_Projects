package br.com.fiap.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="TB_ITEM_TESTE")
@SequenceGenerator(name = "itemTeste", sequenceName = "SQ_TB_ITEM_TESTE", allocationSize = 1)
public class itemTeste {
	
	@Id
	@Column(name = "cd_item_teste", nullable = false)
	@GeneratedValue(generator = "itemTeste", strategy = GenerationType.SEQUENCE)
	private int cd_itemTeste;
	
	@Column(name = "ds_item_teste", length = 150, nullable = true)
	private String descItemTeste;
	
	@ManyToMany(mappedBy = "itens")
	private List<Usuario> usuario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cd_caso_teste")
	private CasoTeste casoTeste;

	public CasoTeste getCasoTeste() {
		return casoTeste;
	}

	public void setCasoTeste(CasoTeste casoTeste) {
		this.casoTeste = casoTeste;
	}

	public itemTeste() {}
	
	// CRIAR
	public itemTeste(String descItemTeste) {
		this.descItemTeste = descItemTeste;
	}


	public int getCd_itemTeste() {
		return cd_itemTeste;
	}

	public void setCd_itemTeste(int cd_itemTeste) {
		this.cd_itemTeste = cd_itemTeste;
	}

	public String getDescItemTeste() {
		return descItemTeste;
	}

	public void setDescItemTeste(String descItemTeste) {
		this.descItemTeste = descItemTeste;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	

	
	
	
	
	
	
	
}
