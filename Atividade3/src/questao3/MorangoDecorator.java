package questao3;

public class MorangoDecorator extends CoberturaDecorator{

	public MorangoDecorator(CookingFever cooking) {
		super(cooking);
		super.cooking = cooking;
		super.decoratorDescricao = "Morango";
	}
	
	public String getSabor() {
		return this.cooking.getSabor()+" com "+decoratorDescricao;
	}
	
	public double getCusto() {
		return 1.0+this.cooking.getCusto();
	}

}
