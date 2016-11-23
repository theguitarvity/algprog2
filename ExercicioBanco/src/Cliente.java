
public class Cliente implements Exibivel{
	private String nomeCliente;
	private String cpfCliente;
	public Cliente(String nomeCliente, String cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	public void exibe(){
		System.out.println("Dados do cliente...");
		System.out.println("Nome do cliente: "+this.getNomeCliente());
		System.out.println("CPF do cliente: "+this.getCpfCliente());
	}
	
	
	
	
	
}
