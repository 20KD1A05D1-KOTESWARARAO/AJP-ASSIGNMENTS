import javax.swing.JFrame;

public class MyFrame extends JFrame {
    JFrame f;

    MyFrame() {
        f = new JFrame();
        // f.setBackground(Color.BLUE);
        f.setTitle("StudentReg");
        f.setSize(1200, 800);
        f.setLayout(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        f.setVisible(true);
    }

}
