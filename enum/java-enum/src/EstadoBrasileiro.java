public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
    MINAS_GERAIS ("MG", "Minas Gerais"),
    BAHIA ("BA", "Bahia"),
    RIO_GRANDE_DO_SUL ("RS", "Rio Grande do Sul");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
