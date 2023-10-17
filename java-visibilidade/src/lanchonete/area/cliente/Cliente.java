package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("escolhendo Lanche");
    }
    public void fazerPedido(){
        System.out.println("fazendo pedido");
    }
    public void pagar(){
        consultarSaldoAplicativo();
        System.out.println("pagando");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("consultando saldo no aplicativo");
    }
    //public void pegarPedidoBalcao(){
    //    System.out.println("pegando pedido do balcão");
    //}
}
