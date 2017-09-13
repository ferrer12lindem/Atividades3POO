package questao4;

public class ColchetesDecorator extends NumeroUmDecorator{

	public ColchetesDecorator(NumeroUm numeroUm) {
		super(numeroUm);
		super.numeroUm = numeroUm;
		super.decoratorDescricao = "Colchetes";
	}	
	
	public String imprimir() {
		String retorna = "["+numeroUm.imprimir()+"]";
		return retorna;
	}
	
	public String getDescricao() {
		return numeroUm.getDescricao()+" com "+decoratorDescricao;
	}
}
