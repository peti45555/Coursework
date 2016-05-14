package PlayingMario;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import Creatures.Creature;
import Creatures.CreatureMaker;
import Creatures.SingleMarioMaker;
import Maps.TestMap;

public class GraphicsPanel extends JPanel implements ActionListener,KeyListener{
	
	
	TestMap map = new TestMap();
	CreatureMaker creator = new SingleMarioMaker();
	Creature mario = creator.createCreature();
	
	Timer t = new Timer(5, this);
	int x = 0, y = 0, velx =0, vely =0;
	
	
	public GraphicsPanel() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
	}
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g.setColor(Color.RED);
		g.fillRect(x,y,50,30);
		
		
		//Малюємо карту
		for (int i = 0; i < map.getNumberOfTextures(); i++) {
			g2.drawImage(map.getPartImage(i), map.getPartCoordX(i), map.getPartCoordY(i), null);
		}
	
		//Малюємо Маріо
		g2.drawImage(mario.getImg(),(int) mario.getPosX(), (int)mario.getPosY(), null);
	}


	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		
		
		if (code == KeyEvent.VK_LEFT){
			vely = 0;
			velx = -1;
		}
		if (code == KeyEvent.VK_RIGHT){
			vely = 0;
			velx = 1;
			
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		velx = 0; vely =0;
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(x < 0){
			velx=0;
			x = 0;		
		}

		if(x > 530)
		{
			velx=0;
			x = 530;		
		}

		if(y < 0)
		{
			vely=0;
			y = 0;		
		}

		if(y > 330)
		{
			vely=0;
			y = 330;		
		}


		x += velx;
		y += vely;
		repaint();
		
		
	}
}
