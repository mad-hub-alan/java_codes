public class NestedForLoop {
    public static void main(String[] args){
        for(int i=1; i<=2; i++){
            System.out.println("i :" +i);
            for(int j=1; j<=2; j++){
                System.out.println("j :" +j);
                for(int k=1; k<=2; k++){
                    System.out.println("k :" +k);
                    for(int l=1; l<=2; l++){
                        System.out.println("l :" +l);
                    }
                }
            }
        }
    }
}
