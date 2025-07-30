package exercicio03.entities;

import exemplo.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item: items) {
            sum += item.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + fmt1.format(this.getMoment()) + "\n");
        sb.append("Order status: " + this.getStatus() + "\n");
        sb.append("Client: ");
        sb.append(client.getName() + " ");
        sb.append("(" + fmt2.format(client.getBirthDate()) + ") - ");
        sb.append(client.getEmail() + "\n");
        sb.append("Order items: \n");
        for (OrderItem item : items) {
            sb.append(item.getProduct().getName() + ", ");
            sb.append("$"+ String.format("%.2f", item.getPrice()) + ", ");
            sb.append("Quantity: " + item.getQuantity() + ", ");
            sb.append("Subtotal: " + "$" + String.format("%.2f", item.subTotal()) + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", this.total()));

        return sb.toString();
    }
}
