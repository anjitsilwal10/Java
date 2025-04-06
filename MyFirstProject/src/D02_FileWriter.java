import java.io.FileWriter;
import java.io.IOException;

public class D02_FileWriter {
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("as10.txt");
                myWriter.write("Lionel Messi is the Goat.!");
                myWriter.close();

        }catch(IOException e){
            System.out.println("An Error Occured.!");
            e.printStackTrace();
        }
    }
}
