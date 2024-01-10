
import java.awt.*;

public class AwtLogin {
   
    AwtLogin(){
        
        Frame frame=new Frame();
        Label label1 = new Label("Username");
        Label label = new Label("Password");
        TextField textField= new TextField();
        TextField textField1= new TextField();
        Button button = new Button("LOGIN");
        
        label1.setBounds(20,50,60,30);
        textField1.setBounds(150,53,100,30);
        label.setBounds(20,100,60,40);
        textField.setBounds(150,105,100,30);
        button.setBounds(150,150,100,30);
        
        frame.add(label1);
        frame.add(label);
        frame.add(textField1);
        frame.add(textField);
        frame.add(button);
        
        frame.setSize(500,400);
        frame.setTitle("Login page");
        frame.setLayout(null);
        frame.setVisible(true);
    
    
    
    }
    public static void main(String args[]){
    AwtLogin frame= new AwtLogin();
    
    
    }
    
}
