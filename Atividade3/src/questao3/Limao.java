package questao3;

public class Limao implements CookingFever{
    
	@Override
	public String getSabor() {
		return "Limão";
	}

	@Override
	public double getCusto() {
		double custo = 5.0;
		return custo;
	}
}
