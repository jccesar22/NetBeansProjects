package tipoConta;

public abstract class Conta {


	public int numero;
	public int agencia = 0;
	public String cliente;
	public Double saldo = 0.0;

	public Conta() {

	}
	public Conta(int numero, int agencia, String cliente) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int isAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	// metodo de desositar
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depositado: " + valor);
		System.out.println("Novo saldo: " + saldo + "\n");
	}

	// metodo sacar dinheiro
	public abstract void sacar(double valor);

	@Override
	public String toString() {
		return "agencia "+ isAgencia();
	}
	
	

}
