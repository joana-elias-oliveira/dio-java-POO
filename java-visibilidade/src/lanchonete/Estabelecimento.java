package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
//import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args){
        Cozinheiro cozinheiro = new Cozinheiro();
        //acoes que nao precisam estarem disponieis para toda a aplicação
        //cozinheiro.lavarIngredientes();
        //cozinheiro.baterSuco();
        //cozinheiro.selecionarIngredientesLanche();
        //cozinheiro.prepararLanche();
        //ozinheiro.prepararSuco();
        //cozinheiro.prepararCombo();

        //acoes que estabelecimemto precisa ter ciencia
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //Almoxarife almoxarife = new Almoxarife();
        //acoes que nao precisam estarem disponieis para toda a aplicação
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();
        //acao que somente o seu pacote cozinha precisa conhecer
        //almoxarife.pegarIngredientes();
        //almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        //atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //acao que somente o seu pacote cozinha precisa conhecer
        //atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagar();

        //nao deveria, mas o estabelecimento ainda nao definiu normas de atendimento
        //cliente.pegarPedidoBalcao();

        //esta acao é muito sigilosa, que tal ser privada?
       // cliente.consultarSaldoAplicativo();

        //ja pensou os clientes ouvindo que o gas acabaou?
        //cozinheiro.pedirParaTrocarGas(atendente);
        //cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
