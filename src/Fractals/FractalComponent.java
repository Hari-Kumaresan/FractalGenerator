package Fractals;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class FractalComponent extends JComponent 
{
	private int numIterations;
	private int length;
	public FractalComponent(int iters, int aLength)
	{
		numIterations = iters;
		length = aLength;
	}
	public void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		Fractal f = new Fractal();
		double x1 = 40;
		double y1 = x1 * 2;
		double x2 = length / 2;
		double y2 = y1 * 4;
		double x3 = length;
		double y3 = y1;
		f.draw(g2, numIterations, x1, y1, x2, y2, x3, y3);
		f.draw(g2, numIterations, x3, y3, x1, y1, x2, y2);
	}
}