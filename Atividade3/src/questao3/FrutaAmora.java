package questao3;

public class FrutaAmora extends FrutasDecorator{
	
	public FrutaAmora(CoberturaDecorator cobertura) {
       super(cobertura);
       super.cobertura = cobertura;
       super.decoratorDescricao = "Amora";
	}
	
	public String getSabor() {
		return cobertura.getSabor()+" com "+decoratorDescricao;
	}
	
	public double getCusto() {
		return 2.0+cobertura.getCusto();
	}
}
