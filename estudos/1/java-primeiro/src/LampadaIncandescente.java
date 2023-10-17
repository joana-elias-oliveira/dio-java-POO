public class LampadaIncandescente {

    // Atributo para armazenar o estado da lâmpada (Acesa ou Apagada)
    private boolean acesa;

    // Construtor para criar uma lâmpada inicialmente apagada
    public LampadaIncandescente() {
        this.acesa = false;
    }

    // Método para acender a lâmpada
    public void acender() {
        this.acesa = true;
    }

    // Método para apagar a lâmpada
    public void apagar() {
        this.acesa = false;
    }

    // Método para visualizar o estado da lâmpada
    public void visualizarEstado() {
        if (acesa) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância de LampadaIncandescente
        LampadaIncandescente minhaLampada = new LampadaIncandescente();

        // Visualizando o estado inicial
        minhaLampada.visualizarEstado();

        // Acendendo a lâmpada
        minhaLampada.acender();
        minhaLampada.visualizarEstado();

        // Apagando a lâmpada
        minhaLampada.apagar();
        minhaLampada.visualizarEstado();
    }
}

