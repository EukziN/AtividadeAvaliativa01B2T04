package fag.objetos;

public class Funcionario {
    private String nome;
    private double salario;
    private double novoSalario;
    
    public Funcionario() {}
    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            this.nome = "Nome inválido";
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido. Valor ignorado.");
        }
    }

    public void aumentarSalario(double aumentoPercent) {
        if (aumentoPercent > 0) {
        	aumentoPercent=aumentoPercent/100;
            novoSalario =salario*(1+aumentoPercent);
            
        } else {
            System.out.println("Aumento inválido. Deve ser maior que zero.");
        }
    }

    public void exibirAntigo() {
        System.out.println("Funcionário: " + nome + " | Salário: R$ " + salario);
    }
    public void exibirNovo() {
    	System.out.println("Funcionário: " + nome + " | Salário: R$ " + novoSalario);
    }
}