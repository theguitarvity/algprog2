public class ListaDeExibivel {
	private Exibivel[] itens;
	private int cont;

	public ListaDeExibivel() {
		this(10);
	}

	public ListaDeExibivel(int capacidade) {
		itens = new Exibivel[capacidade];
		cont = 0;
	}

	public void insere(Exibivel f) {
		if (cont == itens.length)
			realoca();
		itens[cont++] = f;
	}

	public int getCont() {
		return cont;
	}

	public Exibivel get(int i) {
		if (i < 0 || i >= cont)
			return null;
		return itens[i];
	}

	public void exibe() {
		System.out.printf("*** Lista com %d itens ***\n", cont);
		System.out.printf("**************************\n");
		for (int i = 0; i < cont; ++i) {
			itens[i].exibe();
			System.out.printf("**************************\n");
		}
		System.out.printf("**************************\n");
	}

	private void realoca() {
		Exibivel[] funcsNovo = new Exibivel[itens.length * 2];
		for (int i = 0; i < cont; ++i)
			funcsNovo[i] = itens[i];
		itens = funcsNovo;
	}
}
