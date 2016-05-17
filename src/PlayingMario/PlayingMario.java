package PlayingMario;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class PlayingMario extends JPanel {


	
	public static void main2(String[] args) {

		GraphicsPanel graphicsPanel = new GraphicsPanel();
		JTextArea score = new JTextArea("");
		
		JFrame window = new JFrame("Kourse vork");
		window.setSize(1080, 640);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		graphicsPanel.setBackground(new Color(92, 153, 250));
		window.add(graphicsPanel);
		window.setVisible(true);
	
		
	}
}