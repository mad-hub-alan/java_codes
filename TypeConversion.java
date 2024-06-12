public class TypeConversion {
    public static void main(String[] args){

       /*

       Widening/Automatic Type Conversion

       byte -> short -> char -> int -> long -> float -> double

        */


        byte byN = 44;      // declaring a byte variable and assigning value 44
        short shN = byN;    // converting byte into short
        char chN = 'M';     // declaring a char var and assigning value 'M'
        int inN = shN;      // converting short into int
        long loN = inN;     // converting int into long
        float flN = loN;    // converting long into float
        double doN = flN;   // converting float into double
        int inN2 = chN;     // converting char into int
        double doN2 = chN;  // converting char into double

        System.out.println("Byte Value : "+byN);
        System.out.println("Byte to Short Value : "+shN);
        System.out.println("Short to Char Value : "+chN);
        System.out.println("Char to Int Value : "+inN);
        System.out.println("Int to Long Value : "+loN);
        System.out.println("Long to Float Value : "+flN);
        System.out.println("Float to Double Value : "+doN);



        System.out.println("--------------------------------");



        /*

        Narrowing / Manual Type Conversion

        double -> float -> long -> int -> char -> short -> byte

        we need to put the datatype with the smaller value

         */

        double doN3 = 97531.44d;
        flN = (float) doN3;
        loN = (long) flN;
        inN = (int) loN;
        chN = (char) inN;
        shN = (short) chN;
        byN = (byte) shN;


        System.out.println("Double Value : "+doN3);
        System.out.println("Double to Float Value : "+flN);
        System.out.println("Float to Long Value : "+loN);
        System.out.println("Long to Int Value : "+inN);
        System.out.println("Int to Char Value : "+chN);
        System.out.println("Char to Short Value : "+shN);
        System.out.println("Short to Byte Value : "+byN);



    }
}
