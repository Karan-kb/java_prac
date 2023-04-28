import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Bufferread {
    public static void main(String[] args){
        try {
            File file = new File("myfile.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String data = "";

            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}