
package questao6;

public class MeuCinema {

	public static void main(String[] args) {

		//Criando os objetos
		
		DVDPlayer dvd = new DVDPlayer("Dvd Samsung");
		LuzAmbiente iluminacao = new LuzAmbiente("Iluminacao do cinema");
		Projetor projetor = new Projetor("Projetor Sony", dvd);
		Amplificador ampl = new Amplificador("Amplificador de áudio", dvd);
		Tela tela = new Tela("Tela para projeção de filmes");
		Pipoqueira pipoca = new Pipoqueira("Quero pipoca!");
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(ampl, dvd,iluminacao, pipoca, projetor, tela);
		
		System.out.println("\t\t\t========================");
		System.out.println("\t\t\t  VOU VER O FILME ......");
		System.out.println("\t\t\t========================\n\n");
		
		homeTheater.assistirFilme();
		
		System.out.println("\n\n\t\t\t========================");
		System.out.println("\t\t\t       FIM DE FILME ......");
		System.out.println("\t\t\t========================\n");
		
		homeTheater.pararFilme();
	}

}

