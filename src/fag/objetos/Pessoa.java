package fag.objetos;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	private double calcImc;
	
	public Pessoa() {}
	
	public Pessoa(String nome, double peso, double altura) {
		setNome(nome);
		setPeso(peso);
		setAltura(altura);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) {
			this.nome=nome;
		}else {
			System.out.println("Nome deve ser informado");
		}
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso>0) {
			this.peso=peso;
		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if(altura>0) {
			this.altura=altura;
		}
	}
	
	public double calcularImc() {
		calcImc=peso/(altura*altura);
		return calcImc;
	}
	
	public String classificacaoImc() {
		String classificacao;
		if(calcImc<18.5) {
			classificacao="abaixo do peso";
		}else if(calcImc>=18.5 && calcImc<25) {
			classificacao="peso normal";
		}else if(calcImc>=25 && calcImc<30) {
			classificacao="sobrepeso";
		}else if(calcImc>=30 && calcImc<35) {
			classificacao="obeso grau um";
		}
		else if(calcImc>=35 && calcImc<40) {
			classificacao="obeso grau dois";
		}else {
			classificacao="obeso grau três";
		}
		return classificacao;
	}
}
