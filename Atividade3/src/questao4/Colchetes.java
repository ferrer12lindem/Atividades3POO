package questao4;

public class Colchetes implements NumeroUm{

	public String imprimir() {
		return "[1]";
	}

	@Override
	public String getDescricao() {
		String resp = "Colchetes";
		return resp;
	}
}
