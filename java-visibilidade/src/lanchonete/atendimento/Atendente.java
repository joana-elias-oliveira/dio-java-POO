package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("servindo mesa");
    }
    private void pegarLancheCozinha(){
        System.out.println("pegando Lanche da cozinha");
    }
    public void receberPagamento(){
        System.out.println("recebendo pagamento");
    }
    void trocarGas(){
        System.out.println("Atendente trocando gas");
    }

    private void pegarPedidoBalcao(){
        System.out.println("pegando pedido do balcão");
    }
}
