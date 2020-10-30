package Background;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Random;
import java.util.Stack;
import javax.swing.JFrame;

public class Pipes extends JFrame
{
	public Pipes()
	{
		super("Pipes");
		setSize(600, 600);
		setVisible(true);
		repaint();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(15, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		Stack<Point> o = new Stack<Point>();
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 600);
		for(int count = 0; count <= 10; count++)
		{
			int x = (int) (Math.random() * 600);
			int y = (int) (Math.random() * 600);
			Point one = new Point(x, y);
			o.push(one);
			int x2 = (int) (Math.random() * 600);
			int y2 = (int) (Math.random() * 600);
			Point two = new Point(x2, y2);
			o.push(two);
		}
		Stack<Point> p = (Stack<Point>)(o.clone());
		Point temp2 = null;
		while(!o.isEmpty())
		{
			Point temp = o.pop();
			if(!o.isEmpty())
				 temp2 = o.peek();
			Random rand = new Random();
			int r = rand.nextInt(255);
			int r2 = rand.nextInt(255);
			int r3 = rand.nextInt(255);
			Color c = new Color(r, r2, r3);
			g.setColor(c);
			g.drawLine((int)temp.getX(), (int)temp.getY(), (int)temp2.getX(), (int)temp2.getY());
			try{
				Thread.currentThread().sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		while(!(p.isEmpty()))
		{
			g.setColor(Color.BLACK);
			Point a = p.pop();
			if(!(p.isEmpty()))
			{
				Point b = p.peek();
				try{
					Thread.currentThread().sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				g.drawLine((int)(a.getX()), (int)a.getY(), (int)b.getX(), (int)b.getY());
			}
		}
	}
	
	public static void main(String args[])
	{
		Pipes application = new Pipes();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}