import java.util.ArrayList;

class EmployeeController {
    private ArrayList<Employee> employees;
    private static EmployeeController instance;

    // Construtor privado da classe EmployeeController
    private EmployeeController() {
        employees = new ArrayList<>();
    }

    // Método para obter uma única instância da classe (Singleton)
    public static EmployeeController getInstance() {
        if (instance == null) {
            instance = new EmployeeController();
        }
        return instance;
    }

    // Adicionar um empregado à lista
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Imprimir todos os empregados na lista
    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Encontrar um empregado pelo nome na lista
    public Employee findEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }

    // Encontrar um empregado pelo CPF na lista
    public Employee findEmployeeByCpf(String cpf) {
        for (Employee employee : employees) {
            if (employee.getCpf().equals(cpf)) {
                return employee;
            }
        }
        return null;
    }
}