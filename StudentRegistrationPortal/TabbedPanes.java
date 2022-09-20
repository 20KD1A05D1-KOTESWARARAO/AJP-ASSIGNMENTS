import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class TabbedPanes {
    MyFrame fr = new MyFrame();
    JPanel p1;
    JPanel p2;
    JPanel p3;
    
    TabbedPanes() {
        // Registration Panel
        JTabbedPane tab = new JTabbedPane();
        p1 = new JPanel();
        // p1.setBackground(Color.CYAN);
        p1.setSize(1200,1200);
        p1.setLayout(null);
        tab.add("Registration", p1);
   
        p2 = new JPanel();
        p2.setSize(1200,1200);
        p2.setLayout(null);
        // p2.setBackground(Color.CYAN);
        tab.add("Login", p2);

        p3 = new JPanel();
        // p3.setBackground(Color.CYAN);
        p3.setSize(1200,1200);
        p3.setLayout(null);
        // tab.setBounds(50, 50, 200, 200);
     
        tab.add("search", p3);

        tab.setBounds(0,0,1200,800);
        fr.f.add(tab);

    }
}