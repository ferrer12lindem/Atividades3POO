package questao6;

public class HomeTheaterFacade {

	private Amplificador amplificador;
	private DVDPlayer DvdPlayer;
	private LuzAmbiente luzAmbiente;
	private Pipoqueira pipoqueira;
	private Projetor projetor;
	private Tela tela;
	
	public HomeTheaterFacade(Amplificador amplificador, DVDPlayer DvdPlayer, LuzAmbiente luzAmbiente, Pipoqueira pipoqueira, Projetor projetor, Tela tela) {
	    this.amplificador = amplificador;
	    this.DvdPlayer = DvdPlayer;
	    this.luzAmbiente = luzAmbiente;
	    this.pipoqueira = pipoqueira;
	    this.projetor = projetor;
	    this.tela = tela;
	}
	
	public void assistirFilme() {
		
		pipoqueira.on();
        pipoqueira.fazerPipoca();
        
        luzAmbiente.on();
		luzAmbiente.luminosidadeMedia();
		
		tela.descer();
		
		projetor.on();
		projetor.modoWideScreen();
		
		amplificador.on();
		amplificador.somStereo();
		amplificador.setVolume(15);
		
		DvdPlayer.on();
		DvdPlayer.play("A Era do Gelo 4....");
	}
	
	public void pararFilme() {
		
		pipoqueira.off();
		
		luzAmbiente.luminosidadeAlta();
		
		tela.subir();
		
		projetor.off();
		
		amplificador.off();
		
		DvdPlayer.eject();
		DvdPlayer.off();
	}
	
	
	
	public Amplificador getAmplificador() {
		return amplificador;
	}
	public void setAmplificador(Amplificador amplificador) {
		this.amplificador = amplificador;
	}
	public DVDPlayer getDvdPlayer() {
		return DvdPlayer;
	}
	public void setDvdPlayer(DVDPlayer dvdPlayer) {
		DvdPlayer = dvdPlayer;
	}
	
	public LuzAmbiente getLuzAmbiente() {
		return luzAmbiente;
	}
	public void setLuzAmbiente(LuzAmbiente luzAmbiente) {
		this.luzAmbiente = luzAmbiente;
	}
	public Pipoqueira getPipoqueira() {
		return pipoqueira;
	}
	public void setPipoqueira(Pipoqueira pipoqueira) {
		this.pipoqueira = pipoqueira;
	}
	public Projetor getProjetor() {
		return projetor;
	}
	public void setProjetor(Projetor projetor) {
		this.projetor = projetor;
	}
	public Tela getTela() {
		return tela;
	}
	public void setTela(Tela tela) {
		this.tela = tela;
	}
}
