package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TB_CASO_TESTE")
@SequenceGenerator(name = "nomeCasoTeste", sequenceName = "SQ_TB_CASO_TESTE", allocationSize = 1)
public class CasoTeste {
	
	@Id
	@Column(name = "cd_caso_teste")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nomeCasoTeste")
	private int cd_casoTeste;
	
	@Column(name = "nm_caso_teste", nullable = false, length = 150)
	private String nomeCasoTeste;
	
	@Column(name = "ds_caso_teste", nullable = false)
	private String descCasoTeste;
	
	@ManyToOne
	@JoinColumn(name="cd_sistema")
	private Sistema sistemas;
	
	@OneToMany(mappedBy = "casoTeste", cascade = CascadeType.ALL)
	private List<itemTeste> itensTeste;
	
	public void addItemTeste(itemTeste item) {
		if (itensTeste == null) {
			itensTeste = new ArrayList<>();
			itensTeste.add(item);
			item.setCasoTeste(this);
			
		}
	}
	
	public CasoTeste() {}	
	
	public CasoTeste(String nomeCasoTeste, String descCasoTeste) {
		super();
		this.nomeCasoTeste = nomeCasoTeste;
		this.descCasoTeste = descCasoTeste;
	}
	
	public Sistema getSistemas() {
		return sistemas;
	}

	public void setSistemas(Sistema sistemas) {
		this.sistemas = sistemas;
	}

	public int getCd_casoTeste() {
		return cd_casoTeste;
	}

	public void setCd_casoTeste(int cd_casoTeste) {
		this.cd_casoTeste = cd_casoTeste;
	}

	public String getNomeCasoTeste() {
		return nomeCasoTeste;
	}

	public void setNomeCasoTeste(String nomeCasoTeste) {
		this.nomeCasoTeste = nomeCasoTeste;
	}

	public String getDescCasoTeste() {
		return descCasoTeste;
	}

	public void setDescCasoTeste(String descCasoTeste) {
		this.descCasoTeste = descCasoTeste;
	}

	public List<itemTeste> getItensTeste() {
		return itensTeste;
	}

	public void setItensTeste(List<itemTeste> itensTeste) {
		this.itensTeste = itensTeste;
	}

	
	
	

	
}
