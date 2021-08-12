package tipoConta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int numero, String nome, String cpf, int agencia) {
        super(numero, nome, cpf, agencia);
    }

    // metodo de desositar
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }

    // metodo sacar dinheiro
    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            if (valor != 0) {
                saldo -= valor;
                System.out.printf("Sacado: R$%.2f ", valor);
                System.out.printf("Novo saldo: R$ %.2f \n", saldo);
            } else {
                System.out.println("Este valor de saque e Invalido \n");
            }
        } else {
            System.out.printf("Saldo de R$%.2f menor que o valor do saque de R$ %.2f \n", saldo, valor);
            System.out.println("Saldo insuficiente. Faca um deposito\n");
        }
    }

    @Override
    public String toString() {
        return "\nInformacao da conta Bancaria\n" + "tipo de Conta : Conta Poupanca \nnome: " + nome + "\nCpf: " + cpf
                + "\nAgencia : " + agencia + "\nsaldo " + String.format("%.2f", saldo);
    }
}
