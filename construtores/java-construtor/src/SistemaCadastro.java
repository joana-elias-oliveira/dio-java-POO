public class SistemaCadastro {
    public static void main(String[] args){
        //criamos uma pessoa no sistema
        Pessoa marcows = new Pessoa("marcows", "122");

        //definimos o endereçi de marcos
        marcows.setEndereco("Rua dos bobos, 0");

        //imprimindo o marcos sem 

        System.out.println("Nome: " + marcows.getNome() + "\nEndereço: " + marcows.getEndereco() + "\nCpf: " + marcows.getCpf());

    }
}
