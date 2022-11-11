import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            String fileName = "c:" + File.separator + "Users" + File.separator + "odhia" + File.separator + "IdeaProjects" + File.separator +"Classes" + File.separator + "people.txt";
            //open file
            FileInputStream fs = new FileInputStream(fileName);
            //get object of data input stream
            DataInputStream in = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null){
                //print the content on the console
                System.out.println(strLine);
            }
            //close input stream
            in.close();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
