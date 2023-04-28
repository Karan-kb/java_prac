import java.io.*;
import java.io.IOException;

public class File2 {


    public static void main(String args[]){
        try{
            File Obj=new File("myfile.txt");
            if (Obj.createNewFile()){
                System.out.println("File created" + Obj.getName());

            }
            else{
                System.out.println("File already exists.");

            }
        }
        catch(IOException e){
            System.out.println("An error has occurred.");
        }
    }
}
