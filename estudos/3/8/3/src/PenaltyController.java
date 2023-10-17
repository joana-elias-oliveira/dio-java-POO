import java.util.ArrayList;

class PenaltyController {
    private double dailyRate;
    private ArrayList<Penalty> penalties;

    public PenaltyController(double dailyRate) {
        this.dailyRate = dailyRate;
        penalties = new ArrayList<>();
    }

    public void addPenalty(Penalty penalty) {
        penalties.add(penalty);
    }

    public double calculateTotalPenalty(Penalty penalty) {
        double totalPenalty = 0;
        int daysLate = penalty.getDaysLate();

        for (int day = 1; day <= daysLate; day++) {
            totalPenalty += dailyRate;
            dailyRate *= 1.5; // Aumenta o valor da multa em 50% a cada dia
        }

        return totalPenalty;
    }
}