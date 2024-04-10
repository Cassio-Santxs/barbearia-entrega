package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Funcionario;
import app.service.FuncionarioService;


@RestController
@RequestMapping("api/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioservice;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Funcionario obj){
		
		try {
			String msg = this.funcionarioservice.save(obj);
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<String>("Não foi possível salvar:   "+ e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
}
