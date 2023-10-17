package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe");
        felipe.setIdade(12);
        felipe.setSexo("Masculino");

        System.out.println("Nome: " + felipe.getNome() + "\nIdade: " + felipe.getIdade() + "\nSexo: " + felipe.getSexo());
    }
}
