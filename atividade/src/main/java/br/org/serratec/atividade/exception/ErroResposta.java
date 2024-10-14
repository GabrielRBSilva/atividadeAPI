package br.org.serratec.atividade.exception;

import java.time.LocalDateTime;
import java.util.List;

public class ErroResposta {

	private Integer status;
	private String titulo;
	private LocalDateTime horaData;
	private List<String> erros;

	public ErroResposta(Integer status, String titulo, LocalDateTime horaData, List<String> erros) {
		super();
		this.status = status;
		this.titulo = titulo;
		this.horaData = horaData;
		this.erros = erros;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDateTime getHoraData() {
		return horaData;
	}

	public void setHoraData(LocalDateTime horaData) {
		this.horaData = horaData;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

}
