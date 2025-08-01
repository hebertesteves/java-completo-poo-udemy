package exercicio03.entities;

public class Individual extends TaxPlayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        int taxRate;
        if (getAnnualIncome() < 20000.0) {
            taxRate = 15;
        } else {
            taxRate = 25;
        }

        return (getAnnualIncome() * (taxRate / 100.0)) - (healthExpenditures * 0.50) ;
    }
}
