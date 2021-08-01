package tipoConta;

public class ContaCorrente extends Conta {

	public String cpf;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numero, int agencia, String cliente, String nome, String cpf) {
		super(numero, agencia, cliente = nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	// metodo de desositar
	@Override
	public void depositar(double valor) {
		System.out.printf("Saldo anterior: R$%.2f ", saldo);
		this.saldo += valor;
		System.out.println("Depositado: R$ " + valor);
		System.out.println("Novo saldo: R$ " + saldo + "\n");
	}

	// metodo sacar dinheiro
	@Override
	public void sacar(double valor) {
		System.out.println("todo saque tem o valor de 0.10 como taxa de saque!\n");
		if (saldo >= valor) {
			if (valor != 0) {
				saldo -= valor + 0.10;
				System.out.println("Sacado: R$ " + valor);
				System.out.printf("Novo saldo: R$ %.2f \n", saldo);
			} else {
				System.out.println("Este valor de saque e Invalido \n");
			}
		} else {
			System.out.println("\"Saldo de :" + saldo + " menor que o valor do saque de " + valor + "\\n\"");
			System.out.println("\"Saldo insuficiente. Fa�a um dep�sito\n");
		}
	}

	@Override
	public String toString() {
		return "Informa��o da conta Bancaria\n" + "tipo de Conta : Conta Corrente \nnome: " + cliente + "\nCpf: " + cpf
				+ "\nAgencia : " + agencia + "\nsaldo da conta: R$" + String.format("%.2f", saldo);
	}

}
