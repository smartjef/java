import java.io.*;

public class FileWriter2    {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fileName = "c:" + File.separator + "Users" + File.separator + "odhia" + File.separator + "IdeaProjects" + File.separator + "Classes" + File.separator + "people.txt";
            File file = new File(fileName);
            System.out.println("Enter text to append to :" + file.getAbsolutePath() + " : ");
            if (file.exists()) {
                FileWriter fstream = new FileWriter(fileName, true);
                BufferedWriter out = new BufferedWriter(fstream);
                out.write(br.readLine());
                out.close();
                System.out.println("Written successfully");
            } else {
                System.out.println("File doesnt exist");
            }
        }catch(Exception ex){
            System.err.println("Error: "+ex.getMessage());
        }
    }
}
