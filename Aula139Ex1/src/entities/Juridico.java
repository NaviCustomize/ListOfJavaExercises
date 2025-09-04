package entities;

public class Juridico extends Contribuinte{
	
	private int numFuncionario;
	
	public Juridico() {
		super();
	}
	
	public Juridico(String nome, Double rendaAnual, int numFuncionario) {
		super(nome, rendaAnual);
		this.numFuncionario = numFuncionario;
	}
	
	public int getNumFuncionario() {
		return numFuncionario;
	}
	
	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}
	
	@Override
	public Double calcImposto() {
		if(numFuncionario > 10) {
			return rendaAnual * 0.14;
		}
		else {
			return rendaAnual * 0.16;
		}
	}
	
}
