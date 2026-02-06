
public class MainSRP {
    public static void main(String[] args) {

        Order order = new Order("Laptop", 2, 1000);

        OrderPriceCalculator calculator = new OrderPriceCalculator();
        double total = calculator.calculateTotalPrice(order);

        System.out.println("Total price: " + total);

        PaymentService payment = new PaymentService();
        payment.processPayment("kaspi");

        NotificationService notification = new NotificationService();
        notification.sendConfirmationEmail("doni@mail.com");
    }
}
