package questao3;

public class DoceLeiteDecorator extends CoberturaDecorator{

	public DoceLeiteDecorator(CookingFever cooking) {
		super(cooking);
		super.cooking = cooking;
		super.decoratorDescricao = "Doce de leite";
	}
	
	public String getSabor() {
		return this.cooking.getSabor()+" com "+this.decoratorDescricao;
	}
	
	public double getCusto() {
		return 1.50+this.cooking.getCusto();
	}
	
}
