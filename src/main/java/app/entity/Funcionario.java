package app.entity;

<<<<<<< HEAD
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFuncionario;
	
	@NotBlank(message = "Informe o nome do Funcionário!")
	private String nmFuncionario;
	
	@NotNull(message = "Informe se o funcionário é Admin ou não!")
	private boolean flAdmin;
	
	@NotBlank(message = "Informe o CPF do Funcionário!")
	private String dsCpf;
	
	@NotBlank(message = "Informe o E-mail do Funcionário!")
	private String dsEmail;
	
	@NotBlank(message = "Informe a senha do Funcionário!")
	private String dsSenha;
	
	@OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Horario> horarios;
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
=======
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFuncionario;
	
	private String nmFuncionario;
	
	private String tpFuncionario;
	
	private String dsCpf;
	
	private String dsLogin;
	
	private String dsSenha;
	
	
	public long getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(long idFuncionario) {
>>>>>>> 21741b77af8f4d3f753f88c5ae634fa3dd323866
		this.idFuncionario = idFuncionario;
	}
	public String getNmFuncionario() {
		return nmFuncionario;
	}
	public void setNmFuncionario(String nmFuncionario) {
		this.nmFuncionario = nmFuncionario;
	}
<<<<<<< HEAD
	public boolean isFlAdmin() {
		return flAdmin;
	}
	public void setFlAdmin(boolean flAdmin) {
		this.flAdmin = flAdmin;
=======
	public String getTpFuncionario() {
		return tpFuncionario;
	}
	public void setTpFuncionario(String tpFuncionario) {
		this.tpFuncionario = tpFuncionario;
>>>>>>> 21741b77af8f4d3f753f88c5ae634fa3dd323866
	}
	public String getDsCpf() {
		return dsCpf;
	}
	public void setDsCpf(String dsCpf) {
		this.dsCpf = dsCpf;
	}
<<<<<<< HEAD
	public String getDsEmail() {
		return dsEmail;
	}
	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
=======
	public String getDsLogin() {
		return dsLogin;
	}
	public void setDsLogin(String dsLogin) {
		this.dsLogin = dsLogin;
>>>>>>> 21741b77af8f4d3f753f88c5ae634fa3dd323866
	}
	public String getDsSenha() {
		return dsSenha;
	}
	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}
<<<<<<< HEAD
	public List<Horario> getHorarios() {
		return horarios;
	}
	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}
=======
>>>>>>> 21741b77af8f4d3f753f88c5ae634fa3dd323866
}
