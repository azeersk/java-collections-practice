import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

public class listClass {
    public static void main(String[] args){
        List al = new ArrayList();
        System.out.println("add elements......................................");
        long alBefore = System.nanoTime();
        for(int i=0; i<100000; i++){
            al.add(i);
        }
        long alAfter = System.nanoTime();
        System.out.println("arraylist taken time add elements: "+ (alAfter - alBefore));

        List ll = new LinkedList();
        long llBefore = System.nanoTime();
        for(int i=0; i<100000; i++){
            ll.add(i);
        }
        long llAfter = System.nanoTime();
        System.out.println("linked list taken time to add elements: "+ (llAfter - llBefore));

        System.out.println("get elements.......................................");

        long alGBefore = System.nanoTime();
        for(int i=0; i<100000; i++){
            al.get(i);
        }
        long alGAfter = System.nanoTime();
        System.out.println("arraylist taken time get elements: "+ (alGAfter - alGBefore));

        long llGBefore = System.nanoTime();
        for(int i=0; i<100000; i++){
            ll.get(i);
        }
        long llGAfter = System.nanoTime();
        System.out.println("linked list taken time to get elements: "+ (llGAfter - llGBefore));

        List arrayList = new ArrayList();
        for(int i=0; i<5; i++){
            arrayList.add(i*2);
        }
        arrayList.forEach(e->{System.out.println(e);});
    }
}
