class ATM {
    private int notes100;
    private int notes50;
    private int notes10;

    public ATM(int initialNotes100, int initialNotes50, int initialNotes10) {
        notes100 = initialNotes100;
        notes50 = initialNotes50;
        notes10 = initialNotes10;
    }

    // Método para efetuar um saque
    public void withdraw(int amount) {
        int remainingAmount = amount;
        int withdrawnNotes100 = 0;
        int withdrawnNotes50 = 0;
        int withdrawnNotes10 = 0;

        while (remainingAmount >= 100 && notes100 > 0) {
            remainingAmount -= 100;
            withdrawnNotes100++;
            notes100--;
        }

        while (remainingAmount >= 50 && notes50 > 0) {
            remainingAmount -= 50;
            withdrawnNotes50++;
            notes50--;
        }

        while (remainingAmount >= 10 && notes10 > 0) {
            remainingAmount -= 10;
            withdrawnNotes10++;
            notes10--;
        }

        if (remainingAmount == 0) {
            System.out.println("Saque de R$" + amount + " efetuado com sucesso:");
            if (withdrawnNotes100 > 0) {
                System.out.println(withdrawnNotes100 + " nota(s) de R$100");
            }
            if (withdrawnNotes50 > 0) {
                System.out.println(withdrawnNotes50 + " nota(s) de R$50");
            }
            if (withdrawnNotes10 > 0) {
                System.out.println(withdrawnNotes10 + " nota(s) de R$10");
            }
        } else {
            System.out.println("Não é possível efetuar o saque da quantia desejada.");
            // Restaura as notas retiradas em caso de erro
            notes100 += withdrawnNotes100;
            notes50 += withdrawnNotes50;
            notes10 += withdrawnNotes10;
        }
    }

    // Método para reabastecer o caixa eletrônico
    public void refill(int notes100, int notes50, int notes10) {
        this.notes100 += notes100;
        this.notes50 += notes50;
        this.notes10 += notes10;
        System.out.println("Caixa Eletrônico reabastecido com sucesso.");
    }
}