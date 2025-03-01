//import java.util.Scanner;
//
//public class MainContaBancaria {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Cria uma nova conta bancária com o saldo inicial
//        double saldoInicial = scanner.nextDouble();
//        desafio.ContaBancaria conta = new desafio.ContaBancaria(saldoInicial);
//
//        // Lê a Entrada com o valor do depósito e aciona o método "depositar"
//        double valorDeposito = scanner.nextDouble();
//        conta.depositar(valorDeposito);
//
//        // Lê a Entrada com o valor do saque e aciona o método "sacar"
//        double valorSaque = scanner.nextDouble();
//        conta.sacar(valorSaque);
//
//        // Fechar o scanner para evitar vazamentos de recursos
//        scanner.close();
//    }
//}
//
//class ContaBancaria {
//    private double saldo;
//
//    public ContaBancaria(double saldoInicial) {
//        this.saldo = saldoInicial;
////        imprimirSaldo();
//    }
//
//    public void depositar(double valor) {
//        this.saldo += valor;
//        System.out.println("Deposito feito.");
//        imprimirSaldo();
//    }
//
//    public void sacar(double valor) {
//        if (this.saldo >= valor) {
//            this.saldo -= valor;
//            System.out.println("Saque feito.");
//        } else {
//            System.out.println("Saldo insuficiente. Saque nao realizado.");
//        }
//        imprimirSaldo();
//    }
//
//    private void imprimirSaldo() {
//        System.out.printf("Saldo atual: %.1f\n", this.saldo);
//    }
//}
