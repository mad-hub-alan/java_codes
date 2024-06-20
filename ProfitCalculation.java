import java.util.*;

public class ProfitCalculation {

    private int numberOfBeetsSold;
    private int costPriceOfBeet;
    private int sellingPricePerBeet;
    private int profit;

    public ProfitCalculation(int NBS, int CP, int SP){
        numberOfBeetsSold = NBS;
        costPriceOfBeet = CP;
        sellingPricePerBeet = SP;
        this.profit = 0;
    }

    public int Profit(){
        this.profit = numberOfBeetsSold*(sellingPricePerBeet-costPriceOfBeet);

        return this.profit;
    }


    public static void main(String args[]) {
        int numberOfBeetsSold = 2;
        int costPricePerBeet = 3;
        int sellingPricePerBeet = 4;
        ProfitCalculation obj = new ProfitCalculation(numberOfBeetsSold, costPricePerBeet, sellingPricePerBeet);
        assert obj.Profit() == 2 : "Expect 2 for (2,3,4)";
        System.out.println("All test cases in main function passed");
    }
}


