import java.io.File;
import java.io.IOException;


public class FilePath {
    public static void main(String[] args) throws IOException {
        String fileName = "people.txt";
        File file;
        //will be stored in the folder named example
        file = new File("c:" + File.separator + "Users" + File.separator + "odhia" + File.separator + "IdeaProjects" + File.separator +"Classes" + File.separator + fileName);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File" + fileName + " has been created to the specified location");
        }
        boolean newFile = file.createNewFile();
        System.out.println("The absolute path of the file is : " + file.getAbsolutePath());

    }
}
