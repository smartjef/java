import java.io.File;
import java.io.IOException;

public class CreateFile1 {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        // if file does not exist
        if (!file.exists()){
            //creat the file
            boolean created = file.createNewFile();
            System.out.println("The file has been created in the current directory");
        }else {
            System.out.println("FILE ALREADY EXIST");
        }
    }


}
