
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeController employeeController = EmployeeController.getInstance();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar empregado");
            System.out.println("2. Imprimir todos os empregados");
            System.out.println("3. Consultar empregado por nome");
            System.out.println("4. Consultar empregado por CPF");
            System.out.println("5. Sair");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Informe o nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Informe o gênero: ");
                    String gender = scanner.nextLine();
                    System.out.print("Informe o CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Informe a data de nascimento: ");
                    String birthDate = scanner.nextLine();
                    System.out.print("Informe o salário: R$");
                    double salary = scanner.nextDouble();

                    Employee employee = new Employee(name, gender, cpf, birthDate, salary);
                    employeeController.addEmployee(employee);
                    break;
                case 2:
                    employeeController.printAllEmployees();
                    break;
                case 3:
                    System.out.print("Informe o nome do empregado a ser consultado: ");
                    String searchName = scanner.nextLine();
                    Employee foundByName = employeeController.findEmployeeByName(searchName);
                    if (foundByName != null) {
                        System.out.println("Empregado encontrado: " + foundByName);
                    } else {
                        System.out.println("Empregado não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Informe o CPF do empregado a ser consultado: ");
                    String searchCpf = scanner.nextLine();
                    Employee foundByCpf = employeeController.findEmployeeByCpf(searchCpf);
                    if (foundByCpf != null) {
                        System.out.println("Empregado encontrado: " + foundByCpf);
                    } else {
                        System.out.println("Empregado não encontrado.");
                    }
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}