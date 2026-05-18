class Order {

    private double price;

    public Order(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive!");
        }
        this.price = price;
    }
    public void applyDiscount(double discountPercent) {
        try {

            if (discountPercent > 50) {
                throw new Exception("Discount cannot exceed 50%!");
            }
            if (discountPercent < 0) {
                throw new Exception("Invalid discount value!");
            }

            double discountAmount = (price * discountPercent) / 100;
            updatePrice(price - discountAmount);

            System.out.println("Discount applied successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    private void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Order order = new Order(1000);

        order.applyDiscount(20);  
        System.out.println("Final Price: " + order.getPrice());

        order.applyDiscount()
    }
}
