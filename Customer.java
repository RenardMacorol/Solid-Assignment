public class Customer {
    private String name;    
    private String address;    

    Customer(String name, String address){
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

}
