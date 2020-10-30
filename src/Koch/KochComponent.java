package Koch;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class KochComponent extends JComponent 
{
	private int numIterations;
	private int length;
	public KochComponent(int iters, int aLength)
	{
		numIterations = iters;
		length = aLength;
	}
	public void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		KochLine koch = new KochLine();
		double x1 = 10;
		double y1 = length / 2;
		double x2 = x1 + length;
		double y2 = y1;
		double x3 = x1 + ((x1 + x2) / 2);
		double y3 = y1 + length;
		koch.draw(g2, numIterations, x1, y1, x2, y2);
		koch.draw(g2, numIterations, x2, y2, x3, y3);
		koch.draw(g2, numIterations, x3, y3, x1, y1);
	}
}