import java.io.*;
import java.io.IOException;
import java.io.FileWriter;


public class FileWrite {
    public static void main(String [] args){
        try{
            FileWriter Writer =new FileWriter("myfile.txt");
            Writer.write("Files in java are good!!");
            Writer.close();
            System.out.println("Successfully written.");

            }
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
