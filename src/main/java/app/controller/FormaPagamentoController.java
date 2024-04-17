package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.FormaPagamento;
import app.service.FormaPagamentoService;

@RestController
@RequestMapping("/api/formaPagamento")
public class FormaPagamentoController {

    @Autowired
    private FormaPagamentoService formaPagamentoService;
    
    @PostMapping("/save")
    public ResponseEntity<String> saveFormaPagamento(@RequestBody FormaPagamento formaPagamento) {
        try {
            FormaPagamento savedFormaPagamento = formaPagamentoService.save(formaPagamento);
            String mensagem = "Forma de pagamento salva com sucesso! ID: " + savedFormaPagamento.getIdFormaPagto();
            return new ResponseEntity<>(mensagem, HttpStatus.CREATED);
        } catch (Exception e) {
            String mensagemErro = "Erro ao salvar a forma de pagamento: " + e.getMessage();
            return new ResponseEntity<>(mensagemErro, HttpStatus.BAD_REQUEST);
        }
    }
}
