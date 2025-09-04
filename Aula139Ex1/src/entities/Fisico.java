package entities;

public class Fisico extends Contribuinte{
	
	private Double gastosSaude;
	private Double erro;
	
	public Fisico() {
		super();
	}
	
	public Fisico(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public Double getGastosSaude() {
		return gastosSaude;
	}
	
	public void settGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double calcImposto() {
		if(rendaAnual < 20000.00) {
			return rendaAnual * 0.15 - gastosSaude * 0.5;
		}
		else if(rendaAnual >= 20000.00) {
			return rendaAnual * 0.25 - gastosSaude * 0.5;
		}
		else {
			return erro;
		}
	}
	
}
