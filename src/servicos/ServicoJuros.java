package servicos;

import java.security.InvalidParameterException;

public interface ServicoJuros {
	
	double getTaxaDeJuros();

	//metodo default
	default public double pagamento(double montante, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Meses deve ser maior que zero");
		}
		return montante * Math.pow(1 + getTaxaDeJuros() / 100, meses);
	}
}