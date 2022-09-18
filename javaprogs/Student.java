import java.util.ArrayList;

public class Student {
    String Fname;
    String Lname;
    String Reg_no;
    String Email_id;
    String Gender;
    String Address;
    ArrayList<String> Skills;
    Student(String Fname,String Lname,String Reg_no,String Email_id,String Gender,String Address,ArrayList<String> Skills){
        this.Fname = Fname;
        this.Lname = Lname;
        this.Reg_no = Reg_no;
        this.Email_id = Email_id;
        this.Gender = Gender;
        this.Address = Address;
        this.Skills = Skills;
    } 
}
