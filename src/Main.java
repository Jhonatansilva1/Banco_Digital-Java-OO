
public class Main {

	public static void main(String[] args) {
		Cliente jhonatan = new Cliente();
		jhonatan.setNome("Jhonatan");
		
		Conta cc = new ContaCorrente(jhonatan);
		Conta poupanca = new ContaPoupanca(jhonatan);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
