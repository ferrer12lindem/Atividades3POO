package questao6;

public class MeuCinema {

	public static void main(String[] args) {

		//Criando os objetos
		
		DVDPlayer dvd = new DVDPlayer("Dvd samsung");
		LuzAmbiente iluminacao = new LuzAmbiente("Iluminacao do cinema");
		Projetor projetor = new Projetor("Projetor sony", dvd);
		Amplificador ampl = new Amplificador("Amplificador de audio", dvd);
		Tela tela = new Tela("tela para projeção de filmes");
		Pipoqueira pipoca = new Pipoqueira("Quero pipoca!");
		
		//Para assistir a um filme.....
		pipoca.on();
		pipoca.fazerPipoca();
		
		iluminacao.on();
		iluminacao.luminosidadeBaixa();
		
		tela.descer();
		
		projetor.on();
		projetor.modoWideScreen();
		
		ampl.on();
		ampl.somStereo();
		ampl.setVolume(10);
		
		dvd.on();
		dvd.play("E o vento levou.....");
		
		System.out.println("========================");
		System.out.println(" vou ver o filme ......");
		System.out.println("========================");
		
		//Para terminar o filme.....
		pipoca.off();
		
		iluminacao.luminosidadeAlta();
		
		tela.subir();
		
		projetor.off();
		
		ampl.off();
		
		dvd.eject();
		dvd.off();
	
		System.out.println("========================");
		System.out.println(" fim do filme ......");
		System.out.println("========================");

	}

}

