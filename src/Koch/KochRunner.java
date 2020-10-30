package Koch;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class KochRunner 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		final int FRAME_WIDTH = 360;
		final int FRAME_HEIGHT = 500;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Koch Snowflake");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String input = JOptionPane.showInputDialog(null, "Number of iterations");
		if (input == null)
		System.exit(0);
		int iterations = Integer.parseInt(input);
		KochComponent component = new KochComponent(iterations, 300);
		component.setBackground(Color.RED);
		frame.setBackground(Color.RED);
		frame.add(component);
		frame.setVisible(true);
		}
}