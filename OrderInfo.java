public class OrderInfo {
    private double price;
    private int quantity;
    OrderInfo(double price, int quantity){
        setPrice(price);
        setQuantity(quantity);
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

    
}
