package contabancaria;

import java.util.Locale;

import tipoConta.ContaCorrente;
import tipoConta.ContaPoupanca;

public class ContaBancaria {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //instcia��o de objeto contaCorrent
        System.out.println("-----------------------Demostracao da conta Corrente-----------------------");
        ContaCorrente contacorente = new ContaCorrente();
        contacorente.nome = "julio";
        contacorente.cpf = "125.423.253-19";
        contacorente.agencia = 1152;
        //saldo inicial com 0 ele n�o permite sacar
        contacorente.sacar(110.0);
        System.out.println(contacorente);

        //demostracao de deposito e saque e depois um deposito, a conta retira 0.10 de valor de taxa de saque
        System.out.println("-----------------------Demostracao da conta Corrente com deposito/saque-----------------------");
        ContaCorrente contacorente2 = new ContaCorrente();
        contacorente2.nome = "julio";
        contacorente2.cpf = "125.423.253-19";
        contacorente2.agencia = 1152;
        //depositado um valor e depois sacando
        contacorente2.depositar(20.00);
        contacorente2.sacar(15.00);
        contacorente2.depositar(20.00);
        System.out.println(contacorente2);

        System.out.println("-----------------------Demostracao da conta poupanca /tentando sacar um valor abaixo do permitido/-----------------------");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.nome = "Julio Cesar soares";
        contaPoupanca.cpf = "114.256.452-25";
        contaPoupanca.agencia = 2535;
        //sacando acima do saldo permitido acima de 0;
        contaPoupanca.sacar(15.00);
        contaPoupanca.getSaldo();
        System.out.println(contaPoupanca);

        System.out.println("-----------------------Demostracao da conta poupanca 2 deposito/saque-----------------------");
        ContaPoupanca contaPoupanca2 = new ContaPoupanca();
        contaPoupanca2.nome = "Julio Cesar soares";
        contaPoupanca2.cpf = "114.256.666-265";
        contaPoupanca2.agencia = 2535;
        //depositado um valor e depois sacando		
        contaPoupanca2.depositar(25.00);
        contaPoupanca2.sacar(15.00);
        System.out.println(contaPoupanca2);

    }

}
