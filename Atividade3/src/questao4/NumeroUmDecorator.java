package questao4;

public class NumeroUmDecorator implements NumeroUm{
	
	protected NumeroUm numeroUm;
	protected String decoratorDescricao;
	
	public NumeroUmDecorator(NumeroUm numeroUm) {
		this.numeroUm = numeroUm;
	}
	
	@Override
	public String imprimir() {
		return numeroUm.imprimir();		
	}

	@Override
	public String getDescricao() {
		return numeroUm.getDescricao();
	}	
}
