public class ClassOne {
    static int aa = 94;
    static int bb = 23;
    static String s = "String variable!!";
    static void Print(){
        System.out.println("Outer class method");
        System.out.println(aa+ bb);
        System.out.println(s);
    }



    static class outerClass{
        static int a = aa;
        static int b = bb;
        public static void innerPrint(){
            System.out.println(a+b );
            System.out.println("Inner class method");
        }
    }
}

class Main{
    public static void main(String[] args){
        ClassOne obj = new ClassOne();
        obj.Print();
        System.out.println("  ");

        ClassOne.outerClass objOne = new ClassOne.outerClass();
        objOne.innerPrint();
    }
}
