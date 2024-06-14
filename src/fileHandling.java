import java.io.*;

public class fileHandling {
    public static void main(String[] args) throws IOException {
//        File newFile = new File("someFile.txt");
//        newFile.createNewFile();

//        FileWriter fileWriter = new FileWriter("someFile.txt");
//        fileWriter.write("Hellow this is my first file in this project!");
//        fileWriter.close();


//        try{
//            FileOutputStream fout=new FileOutputStream("testout.txt");
//            String s="Welcome to javaTpoint.";
//            byte b[]=s.getBytes();//converting string into byte array
//            fout.write(b);
//            fout.close();
//
//            System.out.println("success...");
//        }catch(Exception e){System.out.println(e);}

        FileInputStream fin = new FileInputStream("testout.txt");
        int i = 0;
        while((i=fin.read())!=-1){
            System.out.print((char)i);
        }
        fin.close();



    }
}
