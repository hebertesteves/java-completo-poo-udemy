package exercicio03.entities;

public class Company extends TaxPlayer {
    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        int taxRate = 16;
        if (numberOfEmployees > 10) {
            taxRate = 14;
        }

        return getAnnualIncome() * (taxRate / 100.0);
    }
}
