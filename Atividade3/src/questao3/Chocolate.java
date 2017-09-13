package questao3;

public class Chocolate implements CookingFever{

	@Override
	public String getSabor() {
		String nome = "Chocolate";
		return nome;
	}

	@Override
	public double getCusto() {
		double custo = 6.0;
		return custo;
	}
	
}
