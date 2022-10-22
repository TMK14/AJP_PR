import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComboBoxDemo extends JFrame implements ItemListener {
	JComboBox cb;
	JLabel l1;

	public JComboBoxDemo() {
		setVisible(true);
		setSize(100, 100);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		cb = new JComboBox();
		cb.addItem("Pune");
		cb.addItem("Solapur");
		cb.addItem("Banglore");
		cb.addItem("Mumbai");
		c.add(cb);
		l1 = new JLabel();
		cb.addItemListener(this);
	}

	public static void main(String args[]) {
		new JComboBoxDemo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s = (String) e.getItem();
		l1.setText(s);

	}
}