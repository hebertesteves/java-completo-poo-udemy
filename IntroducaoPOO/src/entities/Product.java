package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return this.quantity * this.price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, $ %.2f, %d units, Total: $ %.2f%n", this.getName(), this.getPrice(), this.getQuantity(), this.totalValueInStock());
    }
}
