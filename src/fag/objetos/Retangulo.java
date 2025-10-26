package fag.objetos;


public class Retangulo {

	private int largura;
	private int altura;
	
	public Retangulo() {}
	public Retangulo(int largura, int altura) {
		setLargura(largura);
		setAltura(altura);
	}	
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		if(largura >0) {
			this.largura = largura;
		}else {
			System.out.println("Largura deve ser maior que zero");
		}
	}
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		if(altura>0) {
			this.altura=altura;
		}else {
			System.out.println("Altura deve ser maior que zero");
		}
	}
	public void exibirArea() {
		int area=altura*largura;
		System.out.println("A área do retângulo é: " +area);
	}
	public void exibirPerimetro() {
		int perimetro= 2*(altura+ largura);
		System.out.println("O perímetro do retângulo é: "+perimetro);
	}
}
