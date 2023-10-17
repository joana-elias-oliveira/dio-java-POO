import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa o Caixa Eletrônico com notas disponíveis
        ATM atm = new ATM(10, 10, 10);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Sacar");
            System.out.println("2. Reabastecer");
            System.out.println("3. Sair");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Informe o valor do saque: R$");
                    int amount = scanner.nextInt();
                    atm.withdraw(amount);
                    break;
                case 2:
                    System.out.print("Informe a quantidade de notas de R$100: ");
                    int refill100 = scanner.nextInt();
                    System.out.print("Informe a quantidade de notas de R$50: ");
                    int refill50 = scanner.nextInt();
                    System.out.print("Informe a quantidade de notas de R$10: ");
                    int refill10 = scanner.nextInt();
                    atm.refill(refill100, refill50, refill10);
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}