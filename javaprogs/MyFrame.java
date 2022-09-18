import java.awt.Color;
import java.util.concurrent.Flow;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    JFrame f;

    MyFrame() {
        f = new JFrame();
        f.setBackground(Color.BLUE);
        f.setTitle("StudentReg");
        f.setSize(1200, 600);
        // f.setLayout("FlowLayout");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        f.setVisible(true);
    }

}
