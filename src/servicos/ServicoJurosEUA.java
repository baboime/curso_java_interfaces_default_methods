package servicos;

public class ServicoJurosEUA implements ServicoJuros{

	private double taxaDeJuros;
	
	public ServicoJurosEUA(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	@Override
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}
}
