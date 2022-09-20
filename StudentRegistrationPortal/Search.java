import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Search extends Login {
    JLabel Name;
    JTextField name;
    JButton srch;

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

    
    
}
