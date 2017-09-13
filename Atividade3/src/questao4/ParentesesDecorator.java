package questao4;

public class ParentesesDecorator extends NumeroUmDecorator{

	public ParentesesDecorator(NumeroUm numeroUm) {
		super(numeroUm);
		super.numeroUm = numeroUm;
		super.decoratorDescricao = "Parênteses";
	}

	public String imprimir() {
		String retorna = "("+numeroUm.imprimir()+")";
		return retorna;
	}
	
	public String getDescricao() {
		return numeroUm.getDescricao()+" com "+decoratorDescricao;
	}
	
}
