public class Placer implements PlaceOrder{

    @Override
    public void placeOrder(Customer customer) {
        System.out.println("Order Place for" + customer.getName() + "at " + customer.getAddress() );
    }
    
}
