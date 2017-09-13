package questao3;

public class Baunilha implements CookingFever{

	@Override
	public String getSabor() {
		String nome = "Baunilha";
		return nome;
	}

	@Override
	public double getCusto() {
		double custo = 3.0;
		return custo;
	}

}
