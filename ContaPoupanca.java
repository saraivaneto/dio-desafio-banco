package desafioDioBanco;

public class ContaPoupanca extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato conta poupanca===");
		super.imprimirInfosComuns();

	}
}
