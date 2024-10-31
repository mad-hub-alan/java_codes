package Exception_Handling;

public class ShortageOfPointsException extends RuntimeException{
    
    int pointsNeeded;
    ShortageOfPointsException(int need){
        pointsNeeded = need;
        System.out.println(pointsNeeded + " Need to play !");
    }
}
