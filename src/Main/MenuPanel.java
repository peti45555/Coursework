package Main;


import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MenuPanel extends JPanel{
	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.drawImage(new ImageIcon(getClass().getResource("/Menu/Menu_bg.png")).getImage(), 0, 0, null);
		g2.drawImage(new ImageIcon(getClass().getResource("/Menu/Menu.png")).getImage(), 100, 100, null);
		for(int i=50;i<200;i++){
			g2.drawImage(new ImageIcon(getClass().getResource("/Mario/Mario_rjump.png")).getImage(), i, 525, null);
		}
		
		
	}

}
