import java.awt.*;  
import java.awt.event.*;  
public class Student {  
    public static void main(String[] args) {
    	System.out.println("Changes done by deepak");
       Frame frame=new Frame("ActionListener Before Java8");  
    
       Button b=new Button("Click Here");  
       b.setBounds(50,100,80,50);  
  
       b.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){  
    	     System.out.println("Hello World!"); 
          }  
       });  
       frame.add(b);
    
       frame.setSize(200,200);  
       frame.setLayout(null);  
       frame.setVisible(true);   
    }  
}