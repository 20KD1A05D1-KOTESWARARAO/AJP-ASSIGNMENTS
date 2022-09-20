import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.io.File;

public class ValidateStu extends Search {
    ValidateStu() {
        Validate.addActionListener(this);
    }

    int validate_Student(String Rg) {
        int i;
        String find_stu = Rg + ".txt";
        System.out.println(find_stu);
        int flag = 0;
        File fl = new File("C:\\Users\\DELL\\Desktop\\myWorkSpace\\javaprogs\\Students");
        if (fl.exists() && fl.isDirectory()) {

            File a[] = fl.listFiles();
            for (i = 0; i < a.length; i++) {
                if (find_stu.equalsIgnoreCase(a[i].getName())) {
                    System.out.println(a[i].getName());
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public void actionPerformed(ActionEvent e) {
        int flg;
        if (e.getSource() == Validate) {
            Validate.setText("Success...");
            flg = validate_Student(Rgn.getText());
            if (flg == 1) {

                Username = new JLabel("UserName : ");
                Pwd = new JLabel("PassWord : ");
                Username.setFont(font);
                Pwd.setFont(font);
                Uname = new JTextField();
                Pswd = new JTextField();
                Uname.setFont(tfont);
                Pswd.setFont(tfont);

                lgn = new JButton("Login");
                lgn.setFont(font);

                Username.setBounds(300, 300, 200, 50);
                Uname.setBounds(600, 300, 300, 50);
                Pwd.setBounds(300, 360, 250, 50);
                Pswd.setBounds(600, 360, 300, 50);
                lgn.setBounds(500, 450, 200, 40);

                tb.p2.add(Username);
                tb.p2.add(Pwd);
                tb.p2.add(Uname);
                tb.p2.add(Pswd);
                tb.p2.add(lgn);
            }
            else{
                JOptionPane.showMessageDialog(Rgn, this, "Invalid RegistrationNo", flg, null);
            }
        } else if (e.getSource() == srch) {
            srch.setText("Student Found");
        } else if (e.getSource() == submit) {
            submit.setText("Submitted");
            Fnm = fn.getText();
            Lnm = ln.getText();
            Rg = rn.getText();
            Em = eid.getText();
            addr = ad.getText();
            System.out.println("name: " + Fnm);
            System.out.println("lname: " + Lnm);
            System.out.println("Gender : " + gen);
            System.out.println("reg: " + Rg);
            System.out.println("email: " + Em);
            System.out.println("Address: " + addr);
            System.out.println("Skills: " + sk);
            new AddStudents(Fnm, Lnm, Rg, gen, Em, addr, sk);
            System.out.println("student added");
        }
    }
}
