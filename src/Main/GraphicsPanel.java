package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GraphicsPanel() {
		
	}
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D)g;
		Image img = new ImageIcon(getClass().getResource("/Mario/Mario_rjump.png")).getImage();
		for(int i=100;i<400;i++){	
		g2.drawImage(img, i, 150, null);
		}
	}
}
