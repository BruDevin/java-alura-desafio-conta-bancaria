import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Correntista correntista = new Correntista();
        Conta conta = new Conta();
        System.out.println("---");
        System.out.println(correntista.getNome());
        System.out.println("---");
        System.out.println("""
                
                1 - Saldo
                2 - Depósito
                3 - Saque
                4 - Sair
                
                """);
        int escolha = menu.nextInt();
        double valor;

        while (escolha != 4) {
            switch (escolha) {
                case 1:
                    System.out.println("Seu saldo é R$ " + conta.getSaldo());
                    break;
                case 2:
                    Scanner deposito = new Scanner(System.in);
                    System.out.println("Informe o valor do depósito: ");
                    valor = deposito.nextDouble();
                    conta.deposito(valor);
                    System.out.println("Depósito realizado");
                    break;
                case 3:
                    Scanner saque = new Scanner(System.in);
                    System.out.println("Informe o valor do saque: ");
                    valor = saque.nextDouble();
                    conta.saque(valor);
                    break;
            }
            if (escolha > 4) {
                System.out.println("Opção inválida");
            }
            System.out.println("""
                
                1 - Saldo
                2 - Depósito
                3 - Saque
                4 - Sair
                
                """);
            escolha = menu.nextInt();
        }
        System.out.println("Volte sempre");
    }
}