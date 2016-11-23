
public class ContaPoupanca extends Conta {
	
	private double taxaRendimento;
	
	
	public ContaPoupanca(long numeroConta, Cliente titular, double saldoConta, double taxaRendimento) {
		super(numeroConta, titular, saldoConta);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	
	
	@Override
	public void exibe(){
		super.exibe();
		System.out.println("Taxa de rendimento da conta poupança: "+this.getTaxaRendimento());
		
	}

	@Override
	public boolean saque(double valor) {
		if(valor<=super.getSaldoConta()){
			saldoConta-=valor;
			return true;
			
		}
		else{
			return false;
		}
	}
	
	

	//@Override
	public void fimDoDia() {
		if(getSaldoConta()>0){
			saldoConta+=getSaldoConta()*this.taxaRendimento;
		}
		
	}

	@Override
	public void fimDoMes() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
