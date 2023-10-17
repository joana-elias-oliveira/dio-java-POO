public class Televisao {

    private boolean ligada;
    private boolean quebrada;

    public Televisao() {
        this.ligada = false;
    }

    public void ligar() {
        if (!quebrada) {
            this.ligada = true;
            System.out.println("A televisão está ligada.");
        } else {
            System.out.println("A televisão está quebrada e não pode ser ligada.");
        }
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("A televisão está desligada.");
    }

    public void quebrar() {
        this.quebrada = true;
        System.out.println("A televisão está quebrada.");
    }

    public void visualizarEstado() {
        if (ligada) {
            System.out.println("A televisão está ligada.");
        } else {
            System.out.println("A televisão está desligada.");
        }

        if (quebrada) {
            System.out.println("A televisão está quebrada.");
        } else {
            System.out.println("A televisão está funcionando.");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância de Televisao
        Televisao televisao = new Televisao();

        // Visualizando o estado inicial
        televisao.visualizarEstado();

        // Ligando a televisão
        televisao.ligar();
        televisao.visualizarEstado();

        // Desligando a televisão
        televisao.desligar();
        televisao.visualizarEstado();

        // Quebrando a televisão
        televisao.quebrar();
        televisao.visualizarEstado();
    }
}
