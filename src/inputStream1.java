import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class inputStream1 {
    public static void main(String[] args){
        try {
            byte[] array = new byte[100];
            InputStream inputS = new FileInputStream("C:\\Users\\azeer\\OneDrive\\Desktop\\inputOf.txt");
            System.out.println("Available of the array: "+ inputS.available());

            System.out.println(inputS.read(array));

            System.out.println(Arrays.toString(array));
            System.out.println(array.length);

            String data = new String(array);
            System.out.print(data);

            inputS.close();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
