import java.awt.*;
import java.awt.event.*;
public class Eventlistener {
      public static void main(String[] args) {
        
            Frame f= new Frame("Event Listener");

             TextField t= new TextField();
            t.setBounds(50,50,150,20);

            Button b= new Button("click here");
             b.setBounds(100,100,60,30);
             
             b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    t.setText("welcome ");
                }
             });
                  f.add(b);
                  f.add(t);
                  f.setSize(400,400);    
                  f.setLayout(null);    
                  f.setVisible(true);
        }
}
