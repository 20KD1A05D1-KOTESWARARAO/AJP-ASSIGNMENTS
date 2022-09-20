import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\DELL\\Desktop\\myWorkSpace\\javaprogs\\Students\\20KD1A05D1.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> details = new ArrayList<String>();
        while(sc.hasNextLine())
        {
            details.add(sc.nextLine());
        }
        System.out.println(details.get(3));
        for (int i=48;i<122;i++)
        {
            System.out.print((char)i+" ");
        }
    
    }
}
