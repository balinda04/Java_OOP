
import java.awt.*;
//public class AwtExample extends Frame {
    
   // AwtExample(){
    //Button button= new Button("Click here");
    //button.setBounds(30,100,80,30);
    
    //add(button);
    //setSize(450,300);
    
    //setVisible(true);
    //setLayout(null);
    //setTitle("example of awt");
    
    //}
    //public static void main(String[] args){
    
    //AwtExample obj = new AwtExample();
    //
//}




public class AwtExample{

AwtExample(){

Frame frame = new Frame();
Label label = new Label("Enter email:");

TextField textField= new TextField();
Button button = new Button("submit");

label.setBounds(20,80,80,30);

textField.setBounds(20,100,80,30);

  button.setBounds(100,100,40,20);
  
  frame.add(label);
  frame.add(textField);
  frame.add(button);
  
  frame.setSize(400,300);
  frame.setLayout(null);
  frame.setTitle("sign up form");
  
  frame.setVisible(true);
  
 
      }
 public static void main(String args[]){
      
 AwtExample frame=new AwtExample();
 
 }

}


























