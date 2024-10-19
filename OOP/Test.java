package OOP;

public class Test {
    public static void main(String[] args){
        
        Mobile mobile = new Mobile();

         
        mobile.setPrice('c');

        double x = 890.7;
        byte b1 = 45;
        short s1 = 345;
        char c1 = 55543;
        long l1 = 938466373;

        mobile.setPrice((int)l1);

        System.out.println(mobile.getPrice());

    }
}
