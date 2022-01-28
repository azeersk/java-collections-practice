import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class outputStream1 {
    public static void main(String[] args){
        String data = "System.out.println(file inside text!!!)";
        try {

            OutputStream output1 = new FileOutputStream("C:\\Users\\azeer\\OneDrive\\Desktop\\output1.txt");
            byte[] array = data.getBytes();
            output1.write(array);
            System.out.println("Data written to the file!!!");
            output1.close();

        }catch (Exception e){
            System.out.println("Exception is: "+e.getMessage());
        }


        try{
            byte[] arrayIn = new byte[39];
            InputStream input1 = new FileInputStream("C:\\Users\\azeer\\OneDrive\\Desktop\\output1.txt");
            System.out.println("text length of the file is: "+ input1.available());
            input1.read(arrayIn);
            System.out.println(Arrays.toString(arrayIn));

            String dataOne = new String(arrayIn);
            System.out.println(dataOne);

            arrayIn.clone();

        }catch (Exception e){
            System.out.println("Exception is: "+e.getMessage());
        }
    }
}
