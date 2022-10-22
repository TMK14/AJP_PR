import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

public class Addition extends Applet implements ActionListener {
    TextField txt1, txt2;
    Button sumbmitBtn;
    Label answer;

    @Override
    public void init() {
        txt1 = new TextField();
        txt2 = new TextField();
        sumbmitBtn = new Button("Addition");
        answer = new Label();
        sumbmitBtn.addActionListener(this);
        add(txt1);
        add(txt2);
        add(sumbmitBtn);
        add(answer);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
    }
    

}