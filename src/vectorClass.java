import java.awt.*;
import java.util.Vector;

public class vectorClass {
    public static void main(String[] args){
        Vector vector = new Vector(5,2);


        long startTime = System.nanoTime();

        for(int i=1; i<=5; i++){
            vector.add(i);
        }

        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
        System.out.println();
    }
}
