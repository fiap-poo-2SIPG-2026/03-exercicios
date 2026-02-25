package exercio01;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        Random rd = new Random();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double valor;

        System.out.print("Correntista --> ");
        conta.correntista = sc.next();
        conta.numero = rd.nextInt(1000, 9999);

        System.out.println("Número da conta " + conta.numero);
        System.out.println("Saldo inicial R$ " + df.format(conta.saldo));
        System.out.print("Valor para depósito R$ ");
        valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println("Saldo atual R$ " + df.format(conta.saldo));
        System.out.print("Valor para saque R$ ");
        valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println("Saldo atual R$ " + df.format(conta.saldo));

    }
}
