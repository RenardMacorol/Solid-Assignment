public class Main {
    public static void main(String[] args) {
        OrderInfo order = new OrderInfo(350,10);
        Customer customer = new Customer("Wonka","Chocolate KingDom");
        ServiceOrder baseService = new ServiceOrder(customer, order);
        baseService.process();

        Email emailService = new Email();
        emailService.send("Wonka@gmail.com");
        InvoicePdf pdf = new InvoicePdf();
        pdf.generate("123.pdf");
    }
}
