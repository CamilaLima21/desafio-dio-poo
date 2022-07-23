package br.com.desafio.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PRADAO * cargaHoraria;
	}	
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
}
