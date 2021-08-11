package tipoConta;

public abstract class Conta extends cliente{

        
	public int numero;
	public int agencia = 0;
	public String cliente;
	public Double saldo = 0.0;

    public Conta(int numero, String cliente, String nome, String cpf) {
        super(nome, cpf);
        this.numero = numero;
        this.cliente = cliente;
    }

  

	


	public int getNumero() {
		return numero;
	}

	public int isAgencia() {
		return agencia;
	}

	public String getCliente() {
		return cliente;
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
