class Employee {
    private String name;
    private String gender;
    private String cpf;
    private String birthDate;
    private double salary;

    public Employee(String name, String gender, String cpf, String birthDate, double salary) {
        this.name = name;
        this.gender = gender;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Gênero: " + gender + ", CPF: " + cpf + ", Data de Nascimento: " + birthDate + ", Salário: R$" + salary;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
}