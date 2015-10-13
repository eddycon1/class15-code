import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SimplePanel extends JPanel {
//	Color bgColor;
	int count = 0;

	SimplePanel() {
		setBackground(Color.GREEN);
		System.err
				.println("Hello from SimplePanel constructor. - the current value of count is "
						+ count);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawString("Simple!", 100, 100);
		System.err
				.println("Hello from SimplePanel.paintComponent-- the current value of count is "
						+ count);
		count++;

	}
}
