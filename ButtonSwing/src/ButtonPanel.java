
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener {

	JButton button1, button2;
	
	ButtonPanel() {
		this.setLayout(new FlowLayout()); // we'll talk about this shortly
		button1 = new JButton("Button 1");
		add(button1);
		button1.addActionListener(this);

		button2 = new JButton("Button 2");
		add(button2);
		button2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1)
			System.out.println("Button 1 was pressed");
		else
			System.out.println("Button 2 was pressed");
	}

}


