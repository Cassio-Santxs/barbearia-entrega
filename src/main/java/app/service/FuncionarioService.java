package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Funcionario;
import app.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	
	@Autowired
	private FuncionarioRepository repository;
	
	public String save(Funcionario obj) {
		this.repository.save(obj);
		return ("Salvo com sucesso!");
	}
}
