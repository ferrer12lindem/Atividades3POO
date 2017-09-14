package questao4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int option = 0;
		String opcao = "";
		boolean terminou = false;
		boolean acabou = false;
		NumeroUm numeroUm = new Chaves();

			System.out.print("\nEscolha a opção:\n\n1 Parênteses\n2 Chaves\n3 Colchetes\n4 Sair\nEscolha um: ");
			option = Integer.parseInt(leitor.nextLine());

			switch (option) {

			case 1:

				numeroUm = new Parenteses();
				System.out.println("Parênteses...");

				do {

					System.out.println(
							"\nEscolha com quem decorar ou cancele:\n1 Parênteses\n2 Chaves\n3 Colchetes\n4 Sair");
					opcao = leitor.nextLine();

					if (opcao.equals("1")) {

						numeroUm = new ParentesesDecorator(numeroUm);
						System.out.println(
								"\nDescrição: " + numeroUm.getDescricao() + "\nImpressão: " + numeroUm.imprimir());

					} else if (opcao.equals("2")) {

						numeroUm = new ChavesDecorator(numeroUm);
						System.out.println(
								"\nDescrição: " + numeroUm.getDescricao() + "\nImpressão: " + numeroUm.imprimir());

					} else if (opcao.equals("3")) {

						numeroUm = new ColchetesDecorator(numeroUm);
						System.out.println(
								"\nDescrição: " + numeroUm.getDescricao() + "\nImpressão: " + numeroUm.imprimir());

					} else if (opcao.equals("4")) {
						System.out.println("Saindo do Game...");
						acabou = true;
					} else {
						System.out.println("Opção inválida");
					}

				} while (acabou != true);

				break;

			case 2:

				numeroUm = new Chaves();

				System.out.println("Chaves...");

				do {

					System.out.println(
							"\nEscolha com quem decorar ou cancele:\n1 Parênteses\n2 Chaves\n3 Colchetes\n4 Sair");
					opcao = leitor.nextLine();

					if (opcao.equals("1")) {

						numeroUm = new ParentesesDecorator(numeroUm);
						System.out.println(
								"\nDescrição: " + numeroUm.getDescricao() + "\nImpressão: " + numeroUm.imprimir());

					} else if (opcao.equals("2")) {

						numeroUm = new ChavesDecorator(numeroUm);
						System.out.println(
								"\nDescrição: " + numeroUm.getDescricao() + "\nImpressão: " + numeroUm.imprimir());

					} else if (opcao.equals("3")) {

						numeroUm = new ColchetesDecorator(numeroUm);
						System.out.println(
								"\nDescrição: " + numeroUm.getDescricao() + "\nImpressão: " + numeroUm.imprimir());

					} else if (opcao.equals("4")) {
						System.out.println("Saindo do Game...");
						acabou = true;
					} else {
						System.out.println("Opção inválida");
					}

				} while (acabou != true);
				break;
			case 3:

				numeroUm = new Colchetes();

				System.out.println("Colchetes...");

				do {

					System.out.println(
							"\nEscolha com quem decorar ou cancele:\n1 Parênteses\n2 Chaves\n3 Colchetes\n4 Sair");
					opcao = leitor.nextLine();

					if (opcao.equals("1")) {

						numeroUm = new ParentesesDecorator(numeroUm);
						System.out.println(
								"\nDescrição: " + numeroUm.getDescricao() + "\nImpressão: " + numeroUm.imprimir());

					} else if (opcao.equals("2")) {

						numeroUm = new ChavesDecorator(numeroUm);
						System.out.println(
								"\nDescrição: " + numeroUm.getDescricao() + "\nImpressão: " + numeroUm.imprimir());

					} else if (opcao.equals("3")) {

						numeroUm = new ColchetesDecorator(numeroUm);
						System.out.println(
								"\nDescrição: " + numeroUm.getDescricao() + "\nImpressão: " + numeroUm.imprimir());

					} else if (opcao.equals("4")) {
						System.out.println("Saindo do Game...");
						acabou = true;
					} else {
						System.out.println("Opção inválida");
					}

				} while (acabou != true);
				break;
				
		    default:
		    	System.out.println("Opção inválida");
		    	
		}
		leitor.close();
	}
}
