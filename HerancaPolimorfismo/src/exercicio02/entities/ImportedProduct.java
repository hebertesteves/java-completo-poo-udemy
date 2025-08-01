package exercicio02.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs fee: $ %.2f)", getName(), totalPrice(), customsFee);
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }
}
