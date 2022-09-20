import java.awt.Font;
import javax.swing.*;

public class Registration {
    JLabel Fname, Lname, RegNo,Gender, EmailId, Address,Skills;
    JButton submit;
    JTextField fn, ln, rn, eid, ad;
    JRadioButton male, female;
    JCheckBox s1,s2,s3,s4,s5;
    Font font = new Font("Verdana", Font.BOLD, 20);
    Font tfont =new Font("Verdana", Font.BOLD, 17);
    TabbedPanes  tb = new TabbedPanes();
    Registration()
    {
        
        JLabel title = new JLabel("Enter your Details");
        title.setFont(new Font("Verdana", Font.BOLD, 25));
        title.setBounds(500,5,500,40);
        Fname = new JLabel("FName : ");
        Lname = new JLabel("Lname :");
        RegNo = new JLabel("RegNo : ");
        Gender = new JLabel("Gender : ");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        EmailId = new JLabel("EmailId :");
        Address = new JLabel("Address :");

        ButtonGroup gr = new ButtonGroup();
        gr.add(male);
        gr.add(female);

        fn = new JTextField();
        ln = new JTextField();
        rn = new JTextField();
        eid = new JTextField();
        ad = new JTextField();

        Skills = new JLabel("Skills : ");
        Skills.setFont(font);
        Fname.setFont(font);
        Lname.setFont(font);
        RegNo.setFont(font);
        Gender.setFont(font);
        male.setFont(new Font("Verdana", Font.BOLD, 17));
        female.setFont(new Font("Verdana", Font.BOLD, 17));
        EmailId.setFont(font);
        Address.setFont(font);

        fn.setFont(tfont);
        ln.setFont(tfont);
        rn.setFont(tfont);
        eid.setFont(tfont);
        ad.setFont(tfont);
        
        Fname.setBounds(150,60,200,50);
        Lname.setBounds(150,120,200,50);
        RegNo.setBounds(150,180,200,50);
        Gender.setBounds(150,240,200,50);
        EmailId.setBounds(150,300,200,50);
        Address.setBounds(150,360,200,50);
        Skills.setBounds(150,420,200,50);


        // Skills 
        s1 = new JCheckBox("C");
        s2 = new JCheckBox("C++");
        s3 = new JCheckBox("Python");
        s4 = new JCheckBox("JAVA");
        s5 = new JCheckBox("DBMS");
        
    

    
        


        fn.setBounds(500,70,500,40);
        ln.setBounds(500,130,500,40);
        rn.setBounds(500,190,500,40);
        male.setBounds(500,250,100,40);
        female.setBounds(700,250,100,40);
        eid.setBounds(500,310,500,40);
        ad.setBounds(500,370,500,40);
        s1.setBounds(500,430,70,40);
        s2.setBounds(570,430,70,40);
        s3.setBounds(640,430,70,40);
        s4.setBounds(530,480,70,40);
        s5.setBounds(600,480,70,40);


        
        tb.p1.add(Fname);
        tb.p1.add(fn);
        tb.p1.add(Lname);
        tb.p1.add(ln);
        tb.p1.add(RegNo);
        tb.p1.add(rn);
        tb.p1.add(Gender);
        tb.p1.add(male);
        tb.p1.add(female);        
        tb.p1.add(EmailId);
        tb.p1.add(eid);
        tb.p1.add(Address);
        tb.p1.add(ad);
        tb.p1.add(Skills);
        tb.p1.add(s1);
        tb.p1.add(s2);
        tb.p1.add(s3);
        tb.p1.add(s4);
        tb.p1.add(s5);
        tb.p1.add(title);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Verdana", Font.BOLD, 25));
        submit.setBounds(550,540,200,50);
        tb.p1.add(submit);
    }
    
}
