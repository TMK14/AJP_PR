import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo2 extends JFrame {

    public MouseEventDemo2()
    {
        JLabel label = new JLabel();
        label.setBounds(50,150,200,100);
        setSize(500, 300);
        add(label);
        
        addMouseListener(new MouseListener()
        {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

                label.setText("Mouse clicked no. of clicks "+e.getClickCount());
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed no. of clicks: "+ e.getClickCount() + "at position"+e.getX() +","+e.getY());

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released no. of clicks "+e.getClickCount());
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered");
                
                
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                
                label.setText("Mouse Exited");
                
            }
            
        });


        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventDemo2();
    }
}