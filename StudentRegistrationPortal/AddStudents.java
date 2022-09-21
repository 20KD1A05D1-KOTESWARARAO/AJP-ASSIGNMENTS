import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class AddStudents extends TabbedPanes{
    AddStudents(String Fname,String Lname,String Reg,String Gender,String EmailId, String Address,ArrayList<String> Skills){

        String alpn = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&1234567890abcdefghijklmnopqrstuvwxyz";
        StringBuilder sbpwd = new StringBuilder(10);
        for (int i =0;i<10;i++)
        {
            int index = (int)(alpn.length()*Math.random());
            sbpwd.append(alpn.charAt(index));
        }
    
        try
        {
            File file = new File("C:\\Users\\DELL\\Desktop\\myWorkSpace\\javaprogs\\Students\\"+Reg+".txt");
            if(file.createNewFile()){
                String file_path = "C:\\Users\\DELL\\Desktop\\myWorkSpace\\javaprogs\\Students\\"+Reg+".txt";
                try{
                    FileWriter fwr = new FileWriter(file_path);
                    String str = Fname+"\n"+Lname+"\n"+Reg+"\n"+Gender+"\n"+EmailId+"\n"+Address+"\n"+Skills+"\n"+sbpwd;
                    fwr.write(str);
                    fwr.close();
                    System.out.println(str);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "An Error Occured", "Error", JOptionPane.ERROR_MESSAGE);

                }
                JOptionPane.showMessageDialog(null, "Registration Successful","Success",JOptionPane.INFORMATION_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Student already exists");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(p1, "An Error Occured", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

}
