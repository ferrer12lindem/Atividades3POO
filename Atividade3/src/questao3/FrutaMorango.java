package questao3;

public class FrutaMorango extends FrutasDecorator{

	public FrutaMorango(CoberturaDecorator cobertura) {
	    super(cobertura);
	    super.cobertura = cobertura;
	    super.decoratorDescricao = "Morango";
	}
	
	public String getSabor() {
		return this.cobertura.getSabor()+" com "+decoratorDescricao;
	}
	
	public double getCusto() {
		return 1.50+this.cobertura.getCusto();
	}

	
}
