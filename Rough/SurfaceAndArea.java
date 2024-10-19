import java.util.*;

 public class SurfaceAndArea{

    private int width;
    private int length;
    private int height;


    SurfaceAndArea(int[] arr){
        width = arr[0];
        length = arr[1];
        height = arr[2];
    }

    public int getWidth(){
        return this.width;
    }
    public int getLength(){
        return this.length;
    }
    public int getHeight(){
        return this.height;
    }

    public int getVolume(){
        return width*length*height;
    }

    public int getSurfaceArea(){
        return (2*width*length)+(2*length*height)+(2*height*width);
    }


    public static void main(String[] args){

        SurfaceAndArea block = new SurfaceAndArea(new int[] { 3, 4, 2 });

        assert block.getLength() == 4 : "Expect length = 4 for SurfaceAndArea([3, 4, 2])";

        assert block.getWidth() == 3 : "Expect width = 3 for SurfaceAndArea([3, 4, 2])";

        assert block.getHeight() == 2 : "Expect height = 2 for SurfaceAndArea([3, 4, 2])";

        assert block.getVolume() == 24 : "Expect volume = 24 for SurfaceAndArea([3, 4, 2])";

        assert block.getSurfaceArea() == 52 : "Expect surface area = 52 for SurfaceAndArea([3, 4, 2])";

        System.out.println("All test cases in main function passed");

        SurfaceAndArea box = new SurfaceAndArea(new int[]{1,2,3});

        System.out.println(box.getWidth());
        System.out.println(box.getLength());
        System.out.println(box.getHeight());
        System.out.println(box.getVolume());
        System.out.println(box.getSurfaceArea());

    }
}
