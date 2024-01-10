
import java.awt.*;
public class AwtForm {
 public static void main(String args[]){
    
    Frame frame= new Frame();
    Label l1,l2;
    
    l1= new Label("frist");
    l2= new Label("second");
    
    l1.setBounds(50,100,100,30);
    l2.setBounds(50,100,100,30);
    frame.add(l2);
    frame.add(l1);
    
    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);
    
    }
    
}
