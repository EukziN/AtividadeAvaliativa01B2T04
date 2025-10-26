package fag.objetos;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(){}
	
	public ContaBancaria(String titular, double saldo) {
		setTitular(titular);
		this.saldo=0;
		
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		if(titular != null & !titular.isBlank()) {
			this.titular=titular;
		}
	}

	public double getSaldo() {
		return saldo;
	}


	public void depositar(double guardar) {
		if(guardar > 0) {
			saldo +=guardar;
		}
	}
	public void sacar(double retirar) {
		if(retirar <= saldo && retirar > 0) {
			saldo -=retirar;
		}else {
			System.out.println("Saque impossível");
		}
	}
	
	
}
