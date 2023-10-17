import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor da multa diária
        System.out.print("Informe o valor da multa diária (x): R$ ");
        double dailyRate = scanner.nextDouble();

        PenaltyController penaltyController = new PenaltyController(dailyRate);

        // Solicitar os dados da multa
        System.out.print("Informe o nome do usuário: ");
        String userName = scanner.next();
        System.out.print("Informe o título do livro: ");
        String bookTitle = scanner.next();
        System.out.print("Informe a quantidade de dias de atraso: ");
        int daysLate = scanner.nextInt();

        // Criar um objeto de multa
        Penalty penalty = new Penalty(userName, bookTitle, daysLate);

        // Adicionar a multa ao controlador
        penaltyController.addPenalty(penalty);

        // Calcular e exibir o valor da multa
        double totalPenalty = penaltyController.calculateTotalPenalty(penalty);
        System.out.println("Valor total da multa: R$" + totalPenalty);

        scanner.close();
    }
}