package app.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Pagamento {

	@Id
	@NotNull
	private Long idPagamento;
	
	@NotNull(message = "Digite a Data de pagamento!")
	private LocalDateTime dtPagamento;
	
	@NotNull(message = "Digite o Id Horario Correto!!")
	private Long idHorario;
	
	@NotNull(message = "Digite o Id Forma de Pagamento Correto!!")
	private Long idFormaPagamento;
	
	@NotNull (message = "Digite a situação correta!!")
	private String dsSituacao;

	
	
	public Long getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(Long idPagamento) {
		this.idPagamento = idPagamento;
	}

	public LocalDateTime getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(LocalDateTime dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public Long getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Long idHorario) {
		this.idHorario = idHorario;
	}

	public Long getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(Long idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public String getDsSituacao() {
		return dsSituacao;
	}

	public void setDsSituacao(String dsSituacao) {
		this.dsSituacao = dsSituacao;
	}
}
