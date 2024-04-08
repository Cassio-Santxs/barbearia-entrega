package app.entity;

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
		this.idFuncionario = idFuncionario;
	}
	public String getNmFuncionario() {
		return nmFuncionario;
	}
	public void setNmFuncionario(String nmFuncionario) {
		this.nmFuncionario = nmFuncionario;
	}
	public String getTpFuncionario() {
		return tpFuncionario;
	}
	public void setTpFuncionario(String tpFuncionario) {
		this.tpFuncionario = tpFuncionario;
	}
	public String getDsCpf() {
		return dsCpf;
	}
	public void setDsCpf(String dsCpf) {
		this.dsCpf = dsCpf;
	}
	public String getDsLogin() {
		return dsLogin;
	}
	public void setDsLogin(String dsLogin) {
		this.dsLogin = dsLogin;
	}
	public String getDsSenha() {
		return dsSenha;
	}
	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}
}
