import java.io.File;
// import java.io.FileWriter;
// import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        //creating new file      ----------run create,write,read,delete individually

            File myfile=new File("newFile.txt");
            try{
               myfile.createNewFile();
               System.out.println("new file created");
            }catch(Exception e){
               System.out.println("unable to create file");
               e.printStackTrace();
            }

        //writing data into file

        // try{
        //     FileWriter fileWriter=new FileWriter("newFile.txt");
        //     fileWriter.write("im writing the text in my newfile\nhello! how are you?");
        //     fileWriter.close();
        // }catch(Exception e){
        //     System.out.println("unable to write in the file");
        //     e.printStackTrace();
        // }

        //reading data from file

        // File myfile=new File("newFile.txt");
        //  try{
        //     Scanner sc=new Scanner(myfile);
        //     while(sc.hasNextLine()){
        //         String line=sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();

        //  }catch(Exception e){
        //     System.out.println("unable to read the file");
        //     e.printStackTrace();
        //  }


        //deleting the file

        // File myfile=new File("newFile.txt");
        // try{
        //     myfile.delete();
        //     System.out.println("file successfully deleted:"+myfile.getName());
        // }catch(Exception e){
        //     System.out.println("problem in deleting in file");
        //     e.printStackTrace();        
        // }
             
    }
}
