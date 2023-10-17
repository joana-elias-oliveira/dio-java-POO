public class SistemaIbge {
    public static void main(String[] args) {
        System.out.println("Estados brasileiros:");
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println(estado.getSigla() + "-" + estado.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.valueOf("SAO_PAULO");
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
    }
}
