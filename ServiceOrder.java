public class ServiceOrder {
    Customer customer;
    OrderInfo orderInfo;
    Calculator calculator = new Calculator();
    Placer placer = new Placer();
    ServiceOrder(Customer customer , OrderInfo order){
        this.orderInfo = order;
        this.customer = customer;
    }

    public void process(){
        calculator.calculateInfo(orderInfo);
        placer.placeOrder(customer);
    }

}
