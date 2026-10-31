import java.util.Scanner;

public class Main {

    static final int SALDO_MINIMO = 300;

    // Lê um número inteiro com segurança: se digitar texto, pede de novo em vez de quebrar
    static int lerInt(Scanner teclado, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = teclado.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite apenas números inteiros.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int saldo = 0;
        String nome = "";
        int menu = 0;

        System.out.println("======= Seja Bem-Vindo Ao Cassino =======");
        System.out.println();

        while (menu != 6) {

            System.out.println("Sua carteira de saldo é de: " + saldo + " créditos");
            System.out.println();
            System.out.println("Qual você deseja selecionar?");
            System.out.println();
            System.out.println("1 - Cadastre seu nome");
            System.out.println("2 - Adicionar Créditos");
            System.out.println("3 - Vamos jogar!");
            System.out.println("4 - Sacar Créditos");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Sair");
            System.out.println();

            menu = lerInt(teclado, "Digite a opcao desejada: ");

            switch (menu) {

                case 1:
                    System.out.print("Cadastre seu nome por favor: ");
                    nome = teclado.nextLine().trim(); // nextLine aceita nome com espaços
                    System.out.println("Seja bem-vindo " + nome + "!!");
                    System.out.println();
                    break;

                case 2:
                    int saldoAdicionado = lerInt(teclado, "Quantos créditos quer adicionar: ");

                    if (saldoAdicionado <= 0) {
                        System.out.println("Digite um valor maior que zero.");
                        break;
                    }

                    saldo += saldoAdicionado;

                    if (saldo >= SALDO_MINIMO) {
                        System.out.println("Você já pode jogar. Boa sorte!");
                    } else {
                        System.out.println("Faltam " + (SALDO_MINIMO - saldo)
                                + " créditos para o valor mínimo (" + SALDO_MINIMO + ").");
                    }
                    System.out.println();
                    break;

                case 3:
                    if (saldo < SALDO_MINIMO) {
                        System.out.println("Saldo insuficiente. Você precisa de pelo menos "
                                + SALDO_MINIMO + " créditos para jogar.");
                    } else {
                        System.out.println("Vamos jogar! (jogo ainda não implementado)");
                    }
                    System.out.println();
                    break;

                case 4:
                    int saque = lerInt(teclado, "Quantos créditos quer sacar: ");

                    if (saque <= 0) {
                        System.out.println("Digite um valor maior que zero.");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente para esse saque.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado. Novo saldo: " + saldo + " créditos.");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Seu saldo atual é de " + saldo + " créditos.");
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Até a próxima jogatina!!");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha de 1 a 6.");
                    System.out.println();
            }
        }

        teclado.close();
    }
}