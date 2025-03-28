public class InvoicePdf implements Invoice{

    @Override
    public void generate(String fileName) {
        System.out.println("generate " + fileName);
    }
    
}
