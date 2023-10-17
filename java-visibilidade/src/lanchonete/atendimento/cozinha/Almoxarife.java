package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("controlando entrada");
    }
    private void controlarSaida(){
        System.out.println("controlando saida");
    }
    void pegarIngredientes(){
        System.out.println("pegando ingredientes");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("Almoxarife trocando gas");
    }
}
