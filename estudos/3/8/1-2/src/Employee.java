class Employee {
    private String name;
    private String gender;
    private String cpf;
    private String birthDate;
    private double salary;

    // Construtor da classe Employee
    public Employee(String name, String gender, String cpf, String birthDate, double salary) {
        this.name = name;
        this.gender = gender;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    // Sobrescrita do método toString para exibir informações do empregado
    @Override
    public String toString() {
        return "Nome: " + name + ", Gênero: " + gender + ", CPF: " + cpf + ", Data de Nascimento: " + birthDate + ", Salário: R$" + salary;
    }

    // Métodos getter para obter o nome e CPF do empregado
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
}