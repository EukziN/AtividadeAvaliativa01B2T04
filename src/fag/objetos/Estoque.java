package fag.objetos;

public class Estoque {
	private String nome;
	private int quantidade;
	
	public Estoque() {}
	public Estoque(String nome, int quantidade) {
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null & !nome.isBlank()) {
			this.nome=nome;
		}
	}
	
	public void adicionaEstoque(int adicionar) {
		if(adicionar>0) {
			quantidade+=adicionar;
		}
	}
	public void retirarEstoque(int retirar) {
		if(retirar>0 && retirar<quantidade) {
			quantidade+=retirar;
		}else {
			System.out.println("Retirada impossivel");
		}
	}
	public int getQuantidade() {
		return quantidade;
	}
}

