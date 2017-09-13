package questao3;

public class FrutaPessego extends FrutasDecorator{

	public FrutaPessego(CoberturaDecorator cobertura) {
		super(cobertura);
		super.cobertura = cobertura;
		super.decoratorDescricao = "Pessego";
	}
	
	public String getSabor() {
		return cobertura.getSabor()+" com "+decoratorDescricao;
	}
	
	public double getCusto() {
		return 1.0+cobertura.getCusto();
	}
}
