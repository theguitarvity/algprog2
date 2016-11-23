
class Banco {

	private ListaDeExibivel contas;
	private ListaDeExibivel clientes;

	public Banco() {
		contas = new ListaDeExibivel();
		clientes = new ListaDeExibivel();
	}

	public void insere(Conta conta) {
		contas.insere(conta);
	}

	public void insere(Cliente cliente) {
		clientes.insere(cliente);
	}

	public void exibe() {
		System.out.println("Lista de Clientes");
		clientes.exibe();
		System.out.println("Lista de Contas");
		contas.exibe();
	}

	public void fimDoDia() {
		for (int i = 0; i < contas.getCont(); ++i) {
			Conta c = (Conta) contas.get(i);
			c.fimDoDia();
		}
	}

	public void fimDoMes() {
		for (int i = 0; i < contas.getCont(); ++i) {
			Conta c = (Conta) contas.get(i);
			c.fimDoMes();
		}
	}

}