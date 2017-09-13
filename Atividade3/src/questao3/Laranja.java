package questao3;

public class Laranja implements CookingFever{

	@Override
	public String getSabor() {
		String nome = "Laranja";
		return nome;
	}

	@Override
	public double getCusto() {
 		double custo = 5.0;
		return custo;
	}

}
