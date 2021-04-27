package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="TB_SISTEMA")
@SequenceGenerator(allocationSize = 1, name = "sistema", sequenceName = "SQ_TB_SISTEMA")
public class Sistema {
	
	@Id
	@Column(name = "cd_sistema")
	@GeneratedValue(generator = "sistema", strategy = GenerationType.SEQUENCE)
	private int cd_sistema;
	
	@Column(name = "nm_sistema", nullable = false)
	private String nomeSistema;	
	
	@OneToMany(mappedBy = "sistemas", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<CasoTeste> casoTeste;
	
	public void addCasoTeste(CasoTeste caso) {
		if (casoTeste == null) {
			casoTeste = new ArrayList<>();
			
			casoTeste.add(caso);
			caso.setSistemas(this);
			
		}
	}
	public Sistema() {}

	// CRIAR
	public Sistema(String nomeSistema) {
		super();
		this.nomeSistema = nomeSistema;
	}
	
	

	public Sistema(int cd_sistema, String nomeSistema, List<CasoTeste> casoTeste) {
		super();
		this.cd_sistema = cd_sistema;
		this.nomeSistema = nomeSistema;
		this.casoTeste = casoTeste;
	}
	public int getCd_sistema() {
		return cd_sistema;
	}

	public void setCd_sistema(int cd_sistema) {
		this.cd_sistema = cd_sistema;
	}

	public String getNomeSistema() {
		return nomeSistema;
	}

	public void setNomeSistema(String nomeSistema) {
		this.nomeSistema = nomeSistema;
	}

	public List<CasoTeste> getCasoTeste() {
		return casoTeste;
	}

	public void setCasoTeste(List<CasoTeste> casoTeste) {
		this.casoTeste = casoTeste;
	}
	
	
	
	

}
