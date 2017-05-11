
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import java.awt.image.BufferStrategy;

	import javax.swing.JFrame;

	import com.sun.org.glassfish.external.amx.MBeanListener;


	public class FRAME extends JFrame
	{
		private BufferStrategy strat;
		private KEYBOARD kb = new KEYBOARD();
		public FRAME()
		{
			super("Schach");
			addMouseMotionListener(kb);
			addMouseListener(kb);
		}
		
		public void makestrat()
		{
			createBufferStrategy(2);
			strat = getBufferStrategy();
		}
		
		public void repaint()
		{
			Graphics g = strat.getDrawGraphics();
			strat.show();
			draw(g);
			g.dispose();
		}
		
		public void draw(Graphics g)
		{
			g.setColor(Color.black);
			g.fillRect(100,100,200,300);
			System.out.println(kb.getMouseUsed());
			System.out.println(kb.getMouseX());
			System.out.println(kb.getMouseY());

		}
	}
