package ZadaniaZjourney.OOP.Zadanie1;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Point2D point1= new Point2D();
        point1.setXY(1f,2f);
        System.out.println(point1.toString());

        float[] xy = point1.getXY();
        System.out.println(Arrays.toString(xy));

        Point3D point2 = new Point3D(1f,2f,3f);
        point2.setY(0f);
        System.out.println(point2);


    }



}
