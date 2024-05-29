import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial da conta
//        System.out.println("Digite o valor do saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        // Solicita a quantidade total de transações
//        System.out.println("Informe a quantidade de transações que deseja realizar: ");
        int quantidadeTransacoes = scanner.nextInt();
//        System.out.println("Transacoes: " + quantidadeTransacoes);

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Solicita o tipo de transação (D para depósito ou S para saque)
//            System.out.println("Escolha o tipo de transação que deseja fazer: ");
//            System.out.println("D - depósito");
//            System.out.println("S - saque");
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);

            // Solicita o valor da transação
//            System.out.println("Digite o valor da transação que deseja realizar: ");
            double valorTransacao = scanner.nextDouble();

            // Atualiza o saldo da conta e adiciona a transação à lista
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add(i + ".Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add(i + ".Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
                continue; // Pula para a próxima iteração do loop
            }
        }

        // Exibir o saldo final e a lista de transações
//        System.out.println("Saldo final: " + saldo);
//        System.out.println("Transações realizadas: ");
        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes: ");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
