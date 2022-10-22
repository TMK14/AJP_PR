import java.awt.Color;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MenuEventDemo extends JFrame implements ActionListener {
    java.awt.MenuBar menuBar;
    java.awt.Menu colors;
    java.awt.Menu exit;

    public MenuEventDemo() {
        setSize(500, 500);
        setTitle("Menu Event Demo");
        menuBar = new java.awt.MenuBar();
        setMenuBar(menuBar);
        colors = new java.awt.Menu("Colors");
        colors.add(new MenuItem("RED"));
        colors.add(new MenuItem("GREEN"));
        colors.add(new MenuItem("YELLOW"));
        exit = new java.awt.Menu("Exit");
        exit.add(new MenuItem("CLOSE"));

        colors.addActionListener(this);
        exit.addActionListener(this);
        menuBar.add(colors);
        menuBar.add(exit);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("RED")) {
            getContentPane().setBackground(Color.RED);
        } else if (actionCommand.equals("GREEN")) {
            getContentPane().setBackground(Color.GREEN);
        } else if (actionCommand.equals("YELLOW")) {
            getContentPane().setBackground(Color.YELLOW);
        } else if (actionCommand.equals("CLOSE")) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new MenuEventDemo();
    }

}
