public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        salvarHistoricoMensagem();
        System.out.println("Enviando mensagem por MSN: ");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem por MSN: ");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão com a internet: ");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagens: ");
    }
}