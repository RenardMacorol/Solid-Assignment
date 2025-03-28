public class Calculator implements CalculateTotal{

    @Override
    public void calculateInfo(OrderInfo order) {
        double total = order.getPrice() * order.getQuantity();
        System.out.println("Total " + total);
    }
    
}
