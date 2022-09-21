import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;



public class Search extends Login {
    JLabel Name;
    JTextField name;
    JButton srch;
    JTable table;
    

    Search() {
        Name = new JLabel("Enter the Student Name : ");
        Name.setFont(font);
        Name.setBounds(250, 100, 300, 50);

        name = new JTextField();
        name.setFont(tfont);
        name.setBounds(600, 100, 450, 50);

        srch = new JButton("Search");
        srch.setFont(font);
        srch.setBounds(500, 170, 200, 40);
        srch.addActionListener(this);
    

        tb.p3.add(Name);
        tb.p3.add(name);
        tb.p3.add(srch);
    }

    void display(String Std_Name) throws FileNotFoundException
    {
        System.out.println(Std_Name);
        String filepath = "C:\\Users\\DELL\\Desktop\\myWorkSpace\\javaprogs\\Students";
        File file = new File(filepath);
        ArrayList<String> list = new ArrayList<>();
        String req_file ="";
        File a[] = file.listFiles();
        for (int i=0;i<a.length;i++)
        {
            File file1 = new File("C:\\Users\\DELL\\Desktop\\myWorkSpace\\javaprogs\\Students\\"+a[i].getName());
            Scanner s = new Scanner(file1);
            while (s.hasNextLine())
            {
                list.add(s.nextLine());
            }
            if(Std_Name.equalsIgnoreCase(list.get(0)))
            {
                req_file = a[i].getName();
                break;
            }
            list.clear();
        }
        System.out.println(req_file);
        System.out.println(list);
        StringBuffer str = new StringBuffer(list.get(6));
        str.deleteCharAt(0);
        str.deleteCharAt(str.length()-1);
        String details[][]= {{"  Name : ",list.get(0)+" "+list.get(1)},
                            {"  Reg_ID : ",list.get(2)},
                            {"  Gender : ",list.get(3)} ,
                            {" Email : ",list.get(4)} ,
                            {"  Address",list.get(5)} ,
                            {"  Skills : ",str.toString()}};
        String col[] ={" "," "};
        table = new JTable(details,col);

        table.setFont(tfont);

        
        table.getColumnModel().getColumn(0).setPreferredWidth(250);
        table.getColumnModel().getColumn(1).setPreferredWidth(650);
        for(int i =0 ;i<6;i++)
        {
            table.setRowHeight(i, 50);
        }
        Border border = new LineBorder(Color.BLACK, 4, true);
        table.setBounds(200,280,900,300);
        table.setBorder(border);
        tb.p3.add(table);
                        

    }

    
    
}
