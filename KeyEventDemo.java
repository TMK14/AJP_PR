import java.applet.Applet;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class KeyEventDemo extends Applet{
    public void init(){
        
        addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent keyEvent){
                showStatus("Key  is  "+KeyEvent.getKeyText(keyEvent.getKeyCode()));
            }
            @Override
            public void keyReleased(KeyEvent e) {
                showStatus("Key  realsed  "+KeyEvent.getKeyText(e.getKeyCode()));
                
            }
            @Override
            public void keyTyped(KeyEvent keyEvent){
            }

        });
    }


   
    


}
//<applet code="KeyEventDemo.class" width=500 height=300></applet>