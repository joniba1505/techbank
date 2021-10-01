package br.com.projetotechbank.techbank.model;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo")
	private int codigo;

	@Column(name="nome", length=100)
	private String nome;

	@Column(name="cpf", length=15, unique=true)
	private String cpf;

	@Column(name="tel", length=15)
	private String telefone;

	@Column(name="email", length=50)
	private String mail;

	@Column(name="data_nasc")
	private LocalDate dataNascimento;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


}
