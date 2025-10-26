package fag;

import java.util.Scanner;
import fag.objetos.*;
public class Principal {
	public static void main (String[] args) {
//		atividade01();
//		atividade02();
//		atividade03();
//		atividade04();
//		atividade05();
//		atividade06();
//		atividade07();
//		atividade08();
//		atividade09();
		atividade10();
		}
	public static void atividade01() {
		Scanner scan = new Scanner (System.in);
		ContaBancaria conta = new ContaBancaria();
		
		System.out.println("Digite a opção: 1 = sacar; 2 = depositar;3 = ver saldo; 4 = sair");
		int escolha = scan.nextInt();
		while(escolha!=4) {
			if(escolha == 1) {
				System.out.println("Digite o valor do saque: ");
				conta.sacar(scan.nextDouble());
			}else if(escolha == 2) {
				System.out.println("Digite o valor para depositar: ");
				conta.depositar(scan.nextDouble());
			}else if(escolha == 3) {
				System.out.println(conta.getSaldo());
			}
			System.out.println("Digite a opção: 1 = sacar; 2 = depositar;3 = ver saldo; 4 = sair");
			escolha = scan.nextInt();
		}
	}
	
	
	    public static void atividade02() {
	        Scanner scan = new Scanner(System.in);
	        Filme[] filmes = new Filme[2];

	        for (int i = 0; i < 2; i++) {
	            System.out.println("Digite o nome do filme escolhido:");
	            String titulo = scan.nextLine();

	            System.out.println("Digite a avaliação do filme (0 a 5):");
	            double avaliacao = scan.nextDouble();
	            scan.nextLine(); 
	            filmes[i] = new Filme(titulo, avaliacao);
	        }

	        System.out.println("\nFilmes cadastrados:");
	        for (int i = 0; i < filmes.length; i++) {
	            Filme f = filmes[i];
	            f.exibir();
	        }

	    }
	    
	    
	    public static void atividade03() {
	    	Scanner scan = new Scanner(System.in);
	    	Funcionario funcionario = new Funcionario();
	    	
	    	System.out.println("Digite o nome do funcionario: ");
	    	funcionario.setNome(scan.nextLine());
	    	System.out.println("Digite o salario do funcionario: ");
	    	funcionario.setSalario(scan.nextDouble());
	    	
	    	System.out.println("Deseja dar um aumento para o funcionario?");
	    	System.out.println("1 = Sim | 2 = Não");
	    	int escolha = scan.nextInt();
	    	scan.nextLine();
	    	if(escolha == 1) {
	    		System.out.println("Quanto em % deseja aumentar? ");
	    		funcionario.aumentarSalario(scan.nextDouble());
	    		funcionario.exibirNovo();
	    	}else {
	    		funcionario.exibirAntigo();
	    	}
	    	
	    }
	    
	    
	    public static void atividade04() {
	    	Scanner scan = new Scanner(System.in);
	    	Retangulo retangulo = new Retangulo();
	    	
	    	System.out.println("Digite a largura do retângulo: ");
	    	retangulo.setLargura(scan.nextInt());
	    	System.out.println("Digite a altura do retângulo: ");
	    	retangulo.setAltura(scan.nextInt());
	    	
	    	retangulo.exibirArea();
	    	retangulo.exibirPerimetro();
	    }

	
		public static void atividade05() {
			Scanner scan = new Scanner(System.in);
			Musica musicaA = new Musica();
			Musica musicaB = new Musica();
			System.out.println("Digite o titulo da 1° Musica: ");
			musicaA.setTitulo(scan.nextLine());
			System.out.println("Digite a duração em segundos da 1° música: ");
			musicaA.setDuracaoSegundos(scan.nextDouble());
			scan.nextLine();
			
			System.out.println("Digite o titulo da 2° Musica: ");
			musicaB.setTitulo(scan.nextLine());
			System.out.println("Digite a duração em segundos da 2° música: ");
			musicaB.setDuracaoSegundos(scan.nextDouble());
			scan.nextLine();
			
			System.out.println("A musica "+musicaA.getTitulo()+" tem duração de "+musicaA.formatarDuracao()+" minutos");
			System.out.println("A musica "+musicaB.getTitulo()+" tem duração de "+musicaB.formatarDuracao()+" minutos");
		}
	
		public static void atividade06() {
		    Scanner scan = new Scanner(System.in);
		 
		    Pessoa pessoa = new Pessoa();
		    
		    System.out.println("Digite o nome da pessoa:");
		    pessoa.setNome(scan.nextLine());
		    System.out.println("Digite o peso do(a) " + pessoa.getNome() + ":");
		    pessoa.setPeso(scan.nextDouble());
		    System.out.println("Digite a altura do(a) " + pessoa.getNome() + ":");
		    pessoa.setAltura(scan.nextDouble());

		    double imc = pessoa.calcularImc();

		    System.out.println("A pessoa " + pessoa.getNome() + " tem IMC de " + String.format("%.2f", imc) + " e isso a classifica como " + pessoa.classificacaoImc());
		}
		public static void atividade07() {
			Scanner scan = new Scanner(System.in);
			ContaLuz conta = new ContaLuz();
			
			System.out.println("Digite o valor consumido de energia em Kwh: ");
			conta.setConsumoKwh(scan.nextDouble());
			System.out.println("Digite o valor monetario do Kwh de energia: ");
			conta.setValorKwh(scan.nextDouble());
			
			System.out.println("O valor da conta total é "+conta.calcularValorTotal());
		}
		
		public static void atividade08() {
			Scanner scan = new Scanner(System.in);
			BicicletaAlugada bicicleta = new BicicletaAlugada();
			
			System.out.println("Digite a quantidade de horas que a bicicleta foi alugada: ");
			bicicleta.setHoras(scan.nextDouble());
			System.out.println("Digite o valor da hora alugada: ");
			bicicleta.setValorHora(scan.nextDouble());
			System.out.println("O total do aluguel da bicicleta é: "+bicicleta.calcularValor());
		}
		
		public static void atividade09() {
			Scanner scan = new Scanner(System.in);
			Estoque estoque = new Estoque();
			
			System.out.println("Digite o nome do item no estoque: ");
			estoque.setNome(scan.nextLine());
			System.out.println("Digite a operação:");
			System.out.println("1 = adicionar ao estoque | 2 = retirar do estoque | 3 = consultar estoque | 4 = sair");
			int escolha = scan.nextInt();
			scan.nextLine();
			while(escolha!=4) {
				if(escolha==1) {
					System.out.println("Digite a quantidade a adicionar ao estoque: ");
					estoque.adicionaEstoque(scan.nextInt());
					scan.nextLine();
				}else if(escolha == 2) {
					System.out.println("Digite a quantidade a remover do estoque:");
					estoque.retirarEstoque(scan.nextInt());
					scan.nextLine();
				}else if(escolha == 3) {
					System.out.println("O produto "+estoque.getNome()+ "está com: "+estoque.getQuantidade()+" em estoque");
					
				}else{
					System.out.println("Operação invalidada");
				}
				System.out.println("Digite a operação:");
				System.out.println("1 = adicionar ao estoque | 2 = retirar do estoque | 3 = consultar estoque | 4 = sair");
				escolha=scan.nextInt();
				scan.nextLine();
			}
		}
		
		public static void atividade10() {
			Scanner scan = new Scanner(System.in);
			Temperatura temp = new Temperatura();
			
			System.out.println("Digite a temperatura em celsius: ");
			temp.setCelsius(scan.nextDouble());
			
			System.out.println("A temperatura em Kelvin é: "+temp.paraKelvin());
			System.out.println("A temperatura em Fahrenheit é: "+temp.paraFahrenheit());
		}
}