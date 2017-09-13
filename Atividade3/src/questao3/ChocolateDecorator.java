package questao3;

public class ChocolateDecorator extends CoberturaDecorator{

	public ChocolateDecorator(CookingFever cooking) {
		super(cooking);
		super.cooking = cooking;
		super.decoratorDescricao = "Chocolate";
	}
	
	public String getSabor() {
		return this.cooking.getSabor()+" com "+this.decoratorDescricao;
	}
	
	public double getCusto() {
		return 1.0+this.cooking.getCusto();
	}

}