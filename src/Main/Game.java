package Main;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import PlayingMario.GraphicsPanel;





public class Game extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Kourse vork");
		window.setSize(1080, 640);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setBackground(new Color(92, 153, 250));
		
		GraphicsPanel graphicsPanel = new GraphicsPanel();
		
		window.add(graphicsPanel);
	
		
		window.setVisible(true);
		
	}
	
}
