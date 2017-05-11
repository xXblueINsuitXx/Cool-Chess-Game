
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class KEYBOARD implements MouseMotionListener, MouseListener
{
	private static int mouseX;
	private static int mouseY;
	public static int getMouseX()
	{
		return mouseX;
	}
	public static int getMouseY()
	{
		return mouseY;
	}
	private static boolean mouseUsed = false;
	public static boolean getMouseUsed()
	{
		return mouseUsed;
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		mouseUsed = true;
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		mouseUsed = false;
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		// TODO Auto-generated method stub
		
	}

}