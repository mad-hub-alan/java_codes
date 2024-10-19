package OOP;
import java.util.*;


public class Mobile {
    private String brand;
    private String model;
    private int price;
    private char ch;

    public Mobile(){
        this.brand = "Nokia";
        this.model = "1100";
    }

    public void setPrice(int p) {
        if(p>=0){
            this.price = p;
        }
    }
    public int getPrice(){
        return this.price;
    }
    

}
