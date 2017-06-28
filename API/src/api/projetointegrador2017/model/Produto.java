package api.projetointegrador2017.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * 
 * @author Matheus Gambarin
 *
 *         Classe respons�vel por conter os atributos do objeto produto
 */
@Entity
@XmlRootElement
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "Data_Cadastro")
	private Date Data_Cadastro;
	@Column(name = "Data_Alteracao")
	private Date Data_Alteracao;
	@Column(name = "excluido")
	private boolean excluido;
	@Column(name = "novo")
	private boolean novo;

	public Date getData_Cadastro() {
		return Data_Cadastro;
	}

	public void setData_Cadastro(Date data_Cadastro) {
		Data_Cadastro = data_Cadastro;
	}

	public Date getData_Alteracao() {
		return Data_Alteracao;
	}

	public void setData_Alteracao(Date data_Alteracao) {
		Data_Alteracao = data_Alteracao;
	}

	public boolean isExcluido() {
		return excluido;
	}

	public void setExcluido(boolean excluido) {
		this.excluido = excluido;
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
