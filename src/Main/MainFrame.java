package Main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.sun.prism.Image;

import PlayingMario.GraphicsPanel;

public class MainFrame extends JFrame implements ActionListener{
	
	
	GraphicsPanel graphicsPanel;
	private String title;
	private Dimension d;
	JButton playButton = new JButton("Play");
	JButton exitButton = new JButton("Exit");
	MenuPanel menu = new MenuPanel();
	
	Timer t = new Timer(5, this);
	
	
	public MainFrame(String title,Dimension d) {
		this.title = title;
		this.d = d;
	}
	
	public void init(){
		setTitle(title);
		setSize(d);
		playButton.addActionListener(new GameListener());
		playButton.setBounds(100, 368, 120, 30);
		playButton.setBackground(new Color(145,65,12));
		playButton.setForeground(new Color(255, 208, 176));
		
		exitButton.addActionListener(new CloseListener());
		exitButton.setBounds(505, 368, 120, 30);
		exitButton.setBackground(new Color(145,65,12));
		exitButton.setForeground(new Color(255, 208, 176));
		
		menu.add(playButton);
		menu.add(exitButton);
		
		menu.setLayout(null);
		
		add(menu);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public class CloseListener implements ActionListener{
		 @Override
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
	}
	
	public class GameListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			getContentPane().setFocusable(false);
			getContentPane().remove(menu);
			graphicsPanel = new GraphicsPanel();
			graphicsPanel.setBackground(new Color(92, 153, 250));
			graphicsPanel.setVisible(true);
			toBack();
			toFront();
			getContentPane().add(graphicsPanel);
			getContentPane().revalidate();
			getContentPane().repaint();
			t.start();
		}		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(graphicsPanel.duyed()||graphicsPanel.hadWon()){
			t.stop();
			try {
				Thread.sleep(2000);
				//graphicsPanel.stop();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			getContentPane().remove(graphicsPanel);
			getContentPane().add(menu);
			getContentPane().revalidate();
			getContentPane().repaint();
			
		}
	
	}

}
