import java.io.*;
import java.nio.charset.StandardCharsets;

public class inputOutput {
    public static void main(String[] args){
        System.out.println("outputStream practice one: ");

        String inData = "System.out.println(Print the data inside of the output file.)";
        String data2 = "this is second line inside the file.....";
        try{
            OutputStream outputA = new FileOutputStream("C:\\Users\\azeer\\OneDrive\\Desktop\\output1.txt");
            byte[] arrayOf = inData.getBytes();
            byte[] arrayOne = data2.getBytes();

            outputA.write(arrayOf);
            outputA.write(arrayOne);
            System.out.println("data is written into the file.........");

            outputA.close();
        }
        catch (Exception e){
            System.out.println("Exception is: "+ e.getMessage());
        }
        System.out.println();

        System.out.println("inputStream practice one: ");

        byte[] arrayIn = new byte[100];
        try {
            InputStream inputOne = new FileInputStream("C:\\Users\\azeer\\OneDrive\\Desktop\\output1.txt");

            System.out.println("count of the file text is: "+inputOne.available());
            inputOne.read(arrayIn);
            String dataOut = new String(arrayIn);
            System.out.println(dataOut);

            inputOne.close();
        }
        catch (Exception e){
            System.out.println("Exception is: "+ e.getMessage());
        }

        File file = new File("C:\\Users\\azeer\\OneDrive\\Desktop\\output1.txt");
        boolean value = file.delete();
        if(value){
            System.out.println("File is successfully deleted!!!");
        }
        else{
            System.out.println("File is not deleted!!!");
        }

    }
}

