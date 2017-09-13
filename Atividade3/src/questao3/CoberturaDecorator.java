package questao3;

public class CoberturaDecorator implements CookingFever{

	protected CookingFever cooking;
	protected String decoratorDescricao;
	
    public CoberturaDecorator(CookingFever cooking, String decoratorDescricao) {
	    this.cooking = cooking;
	    this.decoratorDescricao = decoratorDescricao;
	}
    
    public CoberturaDecorator(CookingFever cooking) {
	    this.cooking = cooking;
	}
    
    public CoberturaDecorator() {
		
	}
	
	@Override
	public String getSabor() {
		return cooking.getSabor();
	}

	@Override
	public double getCusto() {
		return cooking.getCusto();
	}

	public CookingFever getCooking() {
		return cooking;
	}

	public void setCooking(CookingFever cooking) {
		this.cooking = cooking;
	}

	public String getDecoratorDescricao() {
		return decoratorDescricao;
	}

	public void setDecoratorDescricao(String decoratorDescricao) {
		this.decoratorDescricao = decoratorDescricao;
	}

}
