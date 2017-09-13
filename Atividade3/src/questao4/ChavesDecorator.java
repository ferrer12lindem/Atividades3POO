package questao4;

public class ChavesDecorator extends NumeroUmDecorator{

	public ChavesDecorator(NumeroUm numeroUm) {
		super(numeroUm);
		this.numeroUm = numeroUm;	
		super.decoratorDescricao = "Chaves";
	}
	
	public String imprimir() {
		String retorna = "{"+numeroUm.imprimir()+"}";
		return retorna;
	}
	
	public String getDescricao() {
		return numeroUm.getDescricao()+" com "+decoratorDescricao;
	}

}
