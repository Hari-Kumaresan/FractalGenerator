package Fractals;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Fractal 
{
	public void draw(Graphics2D g2, int iteration, double x1, double y1, double x2, double y2, double x3, double y3)
	{
		if(iteration == 1)
		{
			g2.draw(new Line2D.Double(x1, y1, x2, y2));
			g2.draw(new Line2D.Double(x2, y2, x3, y3));
			g2.draw(new Line2D.Double(x3, y3, x1, y1));
		}
		else
		{
			/*double angle = 60 * Math.PI / 180; // 60 degrees
			double dx = (x2 - x1) / 3;
			double dy = (y2 - y1) / 3;
			double x3 = x1 + dx;
			double y3 = y1 + dy;
			double x4 = x2 - dx;
			double y4 = y2 - dy;
			double x5 = x3 + dx * Math.cos(angle) + dy * Math.sin(angle);
			double y5 = y3 + dy * Math.cos(angle) - dx * Math.sin(angle);
			draw(g2, iteration - 1, x1, y1, x3, y3);
			draw(g2, iteration - 1, x3, y3, x5, y5);
			draw(g2, iteration - 1, x5, y5, x4, y4);
			draw(g2, iteration - 1, x4, y4, x2, y2);*/
			double x4 = (x1 + x2) / 2;
			double y4 = (y1 + y2) / 2;
			double x5 = (x2 + x3) / 2;
			double y5 = (y2 + y3) / 2;
			double x6 = (x1 + x3) / 2;
			double y6 = (y1 + y3) / 2;
			draw(g2, iteration - 1, x1, y1, x4, y4, x6, y6);
			draw(g2, iteration - 1, x4, y4, x2, y2, x5, y5);
			draw(g2, iteration - 1, x6, y6, x5, y5, x3, y3);
		}
	}
}