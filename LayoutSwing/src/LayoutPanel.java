import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LayoutPanel extends JPanel  {

	
	LayoutPanel() {
		setLayout(new BorderLayout());

		Button topButton = new Button("Top");
		add(topButton, BorderLayout.NORTH);

//		Button fredButton = new Button("Fred");
		add(topButton, BorderLayout.SOUTH);

		Button rightButton = new Button("Right");
		add(rightButton, BorderLayout.EAST);

		Button leftButton = new Button("Left");
		add(leftButton, BorderLayout.WEST);

		Button middleButton = new Button("Middle");
		add(middleButton, BorderLayout.CENTER);
	}

}


