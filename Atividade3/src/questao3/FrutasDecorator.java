package questao3;

public class FrutasDecorator implements CookingFever {

    protected String decoratorDescricao;
    protected CoberturaDecorator cobertura;
    
    public FrutasDecorator(CoberturaDecorator cobertura, String decoratorDescricao) {
    	this.cobertura = cobertura;
    	this.decoratorDescricao = decoratorDescricao;
    }
    
    public FrutasDecorator(CoberturaDecorator cobertura) {
    	this.cobertura = cobertura;
    }
  
	
	@Override
	public String getSabor() {		
		return cobertura.getSabor();
	}

	@Override
	public double getCusto() {
		double valor = cobertura.getCusto();
		return valor;
	}
}
