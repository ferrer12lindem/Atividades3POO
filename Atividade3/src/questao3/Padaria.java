package questao3;

import java.util.Scanner;

public class Padaria {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int quant = 1;
		CookingFever cooking = new Baunilha();
		int opcao = 0;
		int opt = 0;
		String optionBoolean = "";
		String optEscolheFruit = "";
		int optionEscolhaSuaFruit = 0;

		System.out.println("\n\t\t\tFazer pedido de três bolos...");

		while (quant <= 3) {

			System.out.print("\nDescreva o " + quant
					+ " bolo:\n\nOpções:\n1 Baunilha\n2 Chocolate\n3 Laranja\n4 Limão\nDigite a opção: ");
			opcao = Integer.parseInt(leitor.nextLine());

			switch (opcao) {

			case 1:

				cooking = new Baunilha();
				System.out.println("Sabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

				System.out.print("Você deseja escolher um adicional [sim ou não]? ");
				optionBoolean = leitor.nextLine();

				if (optionBoolean.equals("sim")) {

					System.out.print("\n1 Chocolate\n2 Doce com leite\n3 Morango\nEscolha seu adicional: ");
					opt = Integer.parseInt(leitor.nextLine());

					if (opt == 1) {

						cooking = new ChocolateDecorator(new Baunilha());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

								System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
								optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

								if (optionEscolhaSuaFruit == 1) {
                                    
					
									cooking = new FrutaMorango(new ChocolateDecorator(new Baunilha()));
									System.out.println(
											"\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

								} else if (optionEscolhaSuaFruit == 2) {

									cooking = new FrutaAmora(new ChocolateDecorator(new Baunilha()));
									System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
								} else if (optionEscolhaSuaFruit == 3) {

									cooking = new FrutaPessego(new ChocolateDecorator(new Baunilha()));
									System.out.println(
											"\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
								}else {
									System.out.println("Opção inválida");
								}
								
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					} else if (opt == 2) {

						cooking = new DoceLeiteDecorator(new Baunilha());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new DoceLeiteDecorator(new Baunilha()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new DoceLeiteDecorator(new Baunilha()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new DoceLeiteDecorator(new Baunilha()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
								System.out.println("Opção inválida");
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					} else if (opt == 3) {

						cooking = new MorangoDecorator(new Baunilha());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new MorangoDecorator(new Baunilha()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new MorangoDecorator(new Baunilha()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new MorangoDecorator(new Baunilha()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
								System.out.println("Opção inválida");
							}
						} else if (optEscolheFruit.equals("não")) {

							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					}else {
						System.out.println("Opção é inválida");
					}

				} else if (optionBoolean.equals("não")) {
					System.out.println("Então... Tudo bem");

				} else {
					System.out.println("Opção inválida\nDigite apenas sim ou não");
				}

				break;

			case 2:

				cooking = new Chocolate();
				System.out.println("Sabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

				System.out.println("Você deseja escolher um adicional[sim ou não]? ");
				optionBoolean = leitor.nextLine();

				if (optionBoolean.equals("sim")) {

					System.out.print("\n1 Chocolate\n2 Doce com leite\n3 Morango\nEscolha seu adicional: ");
					opt = Integer.parseInt(leitor.nextLine());

					if (opt == 1) {

						cooking = new ChocolateDecorator(new Chocolate());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new ChocolateDecorator(new Chocolate()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new ChocolateDecorator(new Chocolate()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new ChocolateDecorator(new Chocolate()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
								System.out.println("Opção inválida");
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					} else if (opt == 2) {

						cooking = new DoceLeiteDecorator(new Chocolate());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new DoceLeiteDecorator(new Chocolate()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new DoceLeiteDecorator(new Chocolate()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new DoceLeiteDecorator(new Chocolate()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
							    System.out.println("opção inválida");	
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					} else if (opt == 3) {

						cooking = new MorangoDecorator(new Chocolate());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new MorangoDecorator(new Chocolate()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new MorangoDecorator(new Chocolate()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new MorangoDecorator(new Chocolate()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
							    System.out.println("Opção inválida");	
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					}else {
						System.out.println("Opção é inválida");
					}

				} else if (optionBoolean.equals("não")) {
					System.out.println("Então... Tudo bem");

				} else {
					System.out.println("Opção inválida\nDigite apenas sim ou não");
				}

				break;

			case 3:

				cooking = new Laranja();
				System.out.println("Sabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

				System.out.println("Você deseja escolher um adicional[sim ou não]? ");
				optionBoolean = leitor.nextLine();

				if (optionBoolean.equals("sim")) {

					System.out.print("\n1 Chocolate\n2 Doce com leite\n3 Morango\nEscolha seu adicional: ");
					opt = Integer.parseInt(leitor.nextLine());

					if (opt == 1) {

						cooking = new ChocolateDecorator(new Laranja());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new ChocolateDecorator(new Laranja()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new ChocolateDecorator(new Laranja()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new ChocolateDecorator(new Laranja()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
								System.out.println("Opção inválida");
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					} else if (opt == 2) {

						cooking = new DoceLeiteDecorator(new Laranja());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new DoceLeiteDecorator(new Laranja()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new DoceLeiteDecorator(new Laranja()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new DoceLeiteDecorator(new Laranja()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
								System.out.println("Opção inválida");
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					} else if (opt == 3) {

						cooking = new MorangoDecorator(new Laranja());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new MorangoDecorator(new Laranja()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new MorangoDecorator(new Laranja()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new MorangoDecorator(new Laranja()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
								System.out.println("Opção inválida");
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					}else {
						System.out.println("Opção é inválida");
					}

				} else if (optionBoolean.equals("não")) {
					System.out.println("Então... Tudo bem");

				} else {
					System.out.println("Opção inválida\nDigite apenas sim ou não");
				}

				break;

			case 4:

				cooking = new Limao();
				System.out.println("Sabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

				System.out.println("Você deseja escolher um adicional[sim ou não]? ");
				optionBoolean = leitor.nextLine();

				if (optionBoolean.equals("sim")) {

					System.out.print("\n1 Chocolate\n2 Doce com leite\n3 Morango\nEscolha seu adicional: ");
					opt = Integer.parseInt(leitor.nextLine());

					if (opt == 1) {

						cooking = new ChocolateDecorator(new Limao());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new ChocolateDecorator(new Limao()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new ChocolateDecorator(new Limao()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new ChocolateDecorator(new Limao()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
								System.out.println("Opção inválida");
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					} else if (opt == 2) {

						cooking = new DoceLeiteDecorator(new Limao());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new DoceLeiteDecorator(new Limao()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new DoceLeiteDecorator(new Limao()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new DoceLeiteDecorator(new Limao()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
								System.out.println("Opção inválida");
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}

					} else if (opt == 3) {

						cooking = new MorangoDecorator(new Limao());
						System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

						System.out.println("E deseja escolher uma fruta? [sim ou não]?");
						optEscolheFruit = leitor.nextLine();

						if (optEscolheFruit.equals("sim")) {

							System.out.print("\n1 Morango\n2 Amora\n3 Pêssego\n\nEscolha sua fruta: ");
							optionEscolhaSuaFruit = Integer.parseInt(leitor.nextLine());

							if (optionEscolhaSuaFruit == 1) {

								cooking = new FrutaMorango(new MorangoDecorator(new Limao()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());

							} else if (optionEscolhaSuaFruit == 2) {

								cooking = new FrutaAmora(new MorangoDecorator(new Limao()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							} else if (optionEscolhaSuaFruit == 3) {

								cooking = new FrutaPessego(new MorangoDecorator(new Limao()));
								System.out.println("\nSabor: " + cooking.getSabor() + "\nPreço: " + cooking.getCusto());
							}else {
								System.out.println("Opção inválida");
							}
							
						} else if (optEscolheFruit.equals("não")) {
							System.out.println("Ok então!");

						} else {
							System.out.println("Opção inválida\nDigite apenas sim ou não");
						}
					}else {
						System.out.println("Opção é inválida");
					}
					
				} else if (optionBoolean.equals("não")) {
					System.out.println("Então... Tudo bem");

				} else {
					System.out.println("Opção inválida\nDigite apenas sim ou não");
				}
				break;
			}
			quant++;
		}
		System.out.println("\n\t\t\tFindo os pedidos");
		leitor.close();
	}
}