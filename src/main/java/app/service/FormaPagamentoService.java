package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.FormaPagamento;
import app.repository.FormaPagamentoRepository;

@Service
public class FormaPagamentoService {

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public FormaPagamento save(FormaPagamento formaPagamento) {
        return formaPagamentoRepository.save(formaPagamento);
    }
}
