
public abstract class Conta implements Exibivel{
	private long numeroConta;
	private Cliente titular;
	protected double saldoConta;
	
	
	
	public Conta(long numeroConta, Cliente titular, double saldoConta) {
		
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldoConta = saldoConta;
	}
	public long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void deposita(double valor){
		this.saldoConta+=valor;
	}
	public abstract boolean saque(double valor);
	public abstract void fimDoDia();
	public abstract void fimDoMes();
	
	public void exibe(){
		System.out.println("Dados da conta:");
		System.out.println("Numero da conta: "+this.getNumeroConta());
		System.out.println("Titular da conta: "+this.getTitular().getNomeCliente());
		System.out.println("CPF do titular da conta: "+this.getTitular().getCpfCliente());
		System.out.println("Saldo da conta: "+this.getSaldoConta());
	}
	

}
