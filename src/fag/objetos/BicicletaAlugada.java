package fag.objetos;

public class BicicletaAlugada {
	
	private double horas;
	private double valorHora;
	
	public BicicletaAlugada() {}
	
	public BicicletaAlugada(double horas, double valorHora) {
		setHoras(horas);
		setValorHora(valorHora);
	}
	
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		if(horas>0) {
			this.horas=horas;
		}
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		if(valorHora>0) {
			this.valorHora=valorHora;
		}
	}
	
	public double calcularValor() {
		double total=valorHora*horas;
		return total;
	}
}
