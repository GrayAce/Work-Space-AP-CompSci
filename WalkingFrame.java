import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class WalkingFrame extends JFrame implements ActionListener {
	private WalkingMan man;
	private MovingBall ball;

	public WalkingFrame() {
		setBounds(100, 100, 600, 400);
		man = new WalkingMan(0, 0);
		ball = new MovingBall(10, 10);
		setLayout(null);
		add(man);
		add(ball);
		
		Timer timer = new Timer(10, this);
		timer.start();

		addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == e.VK_UP) {
					man.setDY(-2);
				}

				if (e.getKeyCode() == e.VK_DOWN) {
					man.setDY(2);
				}

				if (e.getKeyCode() == e.VK_LEFT) {
					man.setDX(-2);
				}

				if (e.getKeyCode() == e.VK_RIGHT) {
					man.setDX(2);
				}
				if (e.getKeyCode() == e.VK_B)
				{
				
				add(new MovingBall(0, 0));
				}


			}

			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == e.VK_UP) {
					man.setDY(0);
				}

				if (e.getKeyCode() == e.VK_DOWN) {
					man.setDY(0);
				}

				if (e.getKeyCode() == e.VK_LEFT) {
					man.setDX(0);
				}

				if (e.getKeyCode() == e.VK_RIGHT) {
					man.setDX(0);
				}

			}

		
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		});

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new WalkingFrame();
	}

	int flicker = 1;
	public void actionPerformed(ActionEvent e) {
		man.update();
		if (flicker == 1)
		{
			ball.update();
		}
		else
		{
			ball.down();
			flicker = 1;
		}
		repaint();
	}
}
