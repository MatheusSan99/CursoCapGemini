package Banco;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente("123456789", "Matheus");
        ContaPoupanca contaPoupanca = new ContaPoupanca("123456789","Debora");

        contaCorrente.depositar(500);

        contaCorrente.transferenciaEntreContas(contaPoupanca, 50);

        System.out.println("Usuário " + contaCorrente.getNomeTitular() + " Saldo de R$ " + contaCorrente.getSaldo());

        System.out.println("Usuário " + contaPoupanca.getNomeTitular() + " Saldo de R$ " + contaPoupanca.getSaldo());


    }
}
