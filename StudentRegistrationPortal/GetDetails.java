import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class GetDetails extends Registration implements ActionListener,ItemListener{
    ArrayList<String> sk = new ArrayList<String>();
    String Fnm,Lnm,Rg,gen,Em,addr;
    GetDetails()
    {
        submit.addActionListener(this);
        male.addItemListener(this);
        female.addItemListener(this);
        s1.addItemListener(this);
        s2.addItemListener(this);
        s3.addItemListener(this);
        s4.addItemListener(this);
        s5.addItemListener(this);


    }
    public void actionPerformed(ActionEvent e)
    {
    //    submit.setText("Submitted");
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == s1)
        {
            if (e.getStateChange()==1){
                sk.add(s1.getText());
            }
        }
        if(e.getSource() == s2)
        {
            if (e.getStateChange()==1){
                sk.add(s2.getText());
            }
        }
        if(e.getSource() == s3)
        {
            if (e.getStateChange()==1){
                sk.add(s3.getText());
            }
        }
        if(e.getSource() == s4)
        {
            if (e.getStateChange()==1){
                sk.add(s4.getText());
            }
        }
        if(e.getSource() == s5)
        {
            if (e.getStateChange()==1){
                sk.add(s5.getText());
            }
        }
        if(e.getSource()==male)
        {
            if (e.getStateChange()==1){
                gen = male.getText();
            }
        }
        if(e.getSource()==female)
        {
            if (e.getStateChange()==1){
                gen = female.getText();
            }
        }
        
    }
}
