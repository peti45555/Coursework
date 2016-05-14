package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Maps.TestMap;

public class GraphicsPanel extends JPanel{
	
	//MapLevel_1 map = new MapLevel_1();
	TestMap map = new TestMap();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GraphicsPanel() {
		
	}
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D)g;
		Image img = new ImageIcon(getClass().getResource("/Mario/Mario_rjump.png")).getImage();
		
		for (int i = 0; i < map.getNumberOfTextures(); i++) {
			
			g2.drawImage(map.getPartImage(i), map.getPartCoordX(i), map.getPartCoordY(i), null);
			
		}
		
		for(int i=100;i<400;i++){	
		g2.drawImage(img, i, 150, null);
		}
	}
}
