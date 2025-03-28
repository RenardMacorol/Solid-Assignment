public class Email implements Notify{

    @Override
    public void send(String reciever) {
        System.out.println("Send to  "+ reciever);
    }
    
}
