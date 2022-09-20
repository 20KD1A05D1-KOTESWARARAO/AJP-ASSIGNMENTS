import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Login extends GetDetails {
    JLabel Username, Reg_No;
    JLabel Pwd;
    JTextField Uname, Rgn;
    JTextField Pswd;
    JButton Validate, lgn;

    Login() {

        Reg_No = new JLabel("Enter the Reg_No : ");
        Reg_No.setFont(font);
        Reg_No.setBounds(250, 100, 250, 50);
        Rgn = new JTextField();
        Rgn.setFont(tfont);
        Rgn.setBounds(600, 100, 350, 50);

        Validate = new JButton("Validate");
        Validate.setFont(font);
        Validate.setBounds(500, 170, 200, 40);
        Validate.addActionListener(this);

        tb.p2.add(Reg_No);
        tb.p2.add(Rgn);
        tb.p2.add(Validate);

    }

    
        
    }

    

