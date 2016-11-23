
public class ContaCorrente extends Conta{
	private double limite;
	private double taxaJuros;
	
	public ContaCorrente(long numeroConta, Cliente titular, double saldoConta, double limite, double taxaJuros) {
		super(numeroConta, titular, saldoConta);
		this.limite = limite;
		this.taxaJuros = taxaJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
		
		
	}
	
	
	
	public void exibe(){
		super.exibe();
		System.out.println("Limite da conta corrente: "+this.getLimite());
		System.out.println("Taxa de juros da conta: "+this.getTaxaJuros());
	}
	@Override
	public boolean saque(double valor) {
		if(valor<=(this.getSaldoConta()+this.getLimite())){
			saldoConta -= valor; 
			return true;
		}
		else{
			return false;
		}
	}
	/*
	 * EXERCICIO PROG2 23/11/2016
	 * */
	public void fimDoDia(){
		if(getSaldoConta()<0){
			saldoConta-=getSaldoConta()*this.taxaJuros;
		}
		
	}
	@Override
	public void fimDoMes() {
		// TODO Auto-generated method stub
		
	}
	
	

}
