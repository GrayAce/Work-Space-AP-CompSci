import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class MovingBall extends JComponent {
	public MovingBall(int x, int y)
	{
		setLocation(x, y);
		setSize(20, 40);
	}
	
	public void update() {
		setLocation(getX() + 5, getY() + 1);
	}
	public void down() 
	{
		setLocation(getX() - 3, getY() -1);
	}

	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		setVisible(true);
		Ellipse2D.Double ball = new Ellipse2D.Double(4, 0, 10, 10);
		g2.fill(ball);
	}
		int dy = 0;
		int dx = 0;

		public void setDY(int y) {
			dy = y;
		}

		public void setDX(int x) {
			dx = x;
		}
		
		
		
//
//	public void keyPressed(KeyEvent e)
//		{
//			if   (e.getKeyCode() == e.VK_B)
//			{
//				{
//
//					Ellipse2D.Double ball = new Ellipse2D.Double(4, 0, 10, 10);
//					g2.fill(ball);
//}
//			}}
//			if   (e.getKeyCode() == e.VK_G)
//			{
//				while (MovingBall.getY() != 0 && MovingBall.getX() != 0 && MovingBall.getY() != WalkingFrame.getHeight && MovingBall.getX() != WalkingFrame.getWidth )
//						{
//							this.update();
//						}
//						
//			}
//			
		}

	


