import java.util.Stack;

public class outerClass {
    static String name;
    static int id;
    String college;

   static class  innerClass{
       public static void PrintOf(){
           System.out.print("Student name: "+ name);
           System.out.println("Student Id: "+ id);
           System.out.println("Student college name");
       }
    }

}

class MAinOne{
    public static void main(String[] args){
        outerClass.innerClass obj2 = new outerClass.innerClass();
        obj2.PrintOf();
        System.out.println();

    }
}

