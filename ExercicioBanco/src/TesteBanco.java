import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Banco banco = new Banco();
		Cliente c1 = new Cliente("Victor lopes", "44465895801");
		Cliente c2 = new Cliente("Mauro Silva", "09536143879");
		banco.insere(c1);
		banco.insere(c2);
		ContaCorrente cc = new ContaCorrente(1234, c1, 100, 50, 0.3);
		ContaPoupanca cp = new ContaPoupanca(1238, c2, 150, 0.5);
		banco.insere(cc);
		banco.insere(cp);
		banco.exibe();
		cc.setLimite(60);
		cp.deposita(300);
		cc.deposita(400);
		cc.saque(530);
		cp.saque(420);
		
		banco.exibe();
		
		
		cc.setTaxaJuros(0.005);
		cp.setTaxaRendimento(0.005);

		banco.fimDoDia();
		banco.fimDoDia();
		banco.fimDoMes();

		banco.exibe();
		
		

	}

}
