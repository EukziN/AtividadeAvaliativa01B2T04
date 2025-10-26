package fag.objetos;

public class Musica {
	
	private String titulo;
	private double duracaoSegundos;
	
	public Musica(){}
	
	public Musica(String titulo, double duracaoSegundos) {
		setTitulo(titulo);
		setDuracaoSegundos(duracaoSegundos);
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isBlank()) {
			this.titulo=titulo;
		}
	}
	
	
	public double getDuracaoSegundos() {
		return duracaoSegundos;
	}
	
	public void setDuracaoSegundos(double duracaoSegundos) {
		if(duracaoSegundos > 0) {
			this.duracaoSegundos=duracaoSegundos;
		}else {
			System.out.println("Duração inválida");
		}
	}
	public double formatarDuracao() {
		double duracaoFormatada= duracaoSegundos/60;
		return duracaoFormatada;
	}
}
