package G4;
import java.io.*;
public class IODemo {

    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        f.createNewFile(); // Root folder(src) me ban gayi file abc.txt
        System.out.println(f.exists());// file doesnt exist-> false, exists-> true;

        System.out.println(f.isFile()); // path is of file -> true
        System.out.println(f.isDirectory()); // path is of directory -> false
        System.out.println(f.getAbsolutePath()); // root folder se current  location tak path
        System.out.println(f.getName()); // name of file
        System.out.println(f.length()); // no. of words in file

        // list and listFiles method
        f.list();
        f.listFiles();



    }
}
