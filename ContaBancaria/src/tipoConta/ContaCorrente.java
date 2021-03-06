package tipoConta;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(int numero, String nome, String cpf, int agencia) {
        super(numero, nome, cpf, agencia);
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
            System.out.printf("Saldo de R$%.2f menor que o valor do saque de " + valor + "\n", saldo);
            System.out.println("Saldo insuficiente. Faca um deposito\n");
        }
    }

    @Override
    public String toString() {
        return "Informacao da conta Bancaria\n" + "tipo de Conta : Conta Corrente \nnome: " + nome + "\nCpf: " + cpf
                + "\nAgencia : " + agencia + "\nsaldo da conta: R$" + String.format("%.2f", saldo);
    }

}
