import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Registration {
    JLabel Fname, Lname, RegNo,Gender, EmailId, Address;
    JButton submit;
    JTextField fn, ln, rn, eid, ad;
    JRadioButton male, female;
    JCheckBox select;

    Registration()
    {
        TabbedPanes  tb = new TabbedPanes();
        Font font = new Font("Verdana", Font.BOLD, 20);
        Font tfont =new Font("Verdana", Font.BOLD, 15);

        Fname = new JLabel("FName : ");
        Lname = new JLabel("Lname :");
        RegNo = new JLabel("RegNo : ");
        Gender = new JLabel("Gender : ");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female); 
        EmailId = new JLabel("EmailId :");
        Address = new JLabel("Address :");

        fn = new JTextField();
        ln = new JTextField();
        rn = new JTextField();
        eid = new JTextField();
        ad = new JTextField();

        Fname.setFont(font);
        Lname.setFont(font);
        RegNo.setFont(font);
        Gender.setFont(font);
        EmailId.setFont(font);
        Address.setFont(font);

        fn.setFont(tfont);
        ln.setFont(tfont);
        rn.setFont(tfont);
        eid.setFont(tfont);
        ad.setFont(tfont);
        
        Fname.setBounds(20,60,200,50);
        Lname.setBounds(20,120,200,50);
        RegNo.setBounds(20,180,200,50);
        Gender.setBounds(20,240,200,50);
        EmailId.setBounds(20,300,200,50);
        Address.setBounds(20,360,200,50);

        fn.setBounds(150,70,500,40);
        ln.setBounds(150,130,500,40);
        rn.setBounds(150,190,500,40);
        eid.setBounds(150,310,500,40);
        ad.setBounds(150,370,500,40);


        
        tb.p1.add(Fname);
        tb.p1.add(fn);
        tb.p1.add(Lname);
        tb.p1.add(ln);
        tb.p1.add(RegNo);
        tb.p1.add(rn);
        tb.p1.add(Gender);
        tb.p1.add(male);
        tb.p1.add(female);
        tb.p1.add(group);        
        tb.p1.add(EmailId);
        tb.p1.add(eid);
        tb.p1.add(Address);
        tb.p1.add(ad);
        submit = new JButton("click");
        tb.p1.add(submit);
    }
    
}
