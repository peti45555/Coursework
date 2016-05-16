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

public class GraphicsPanel extends JPanel implements ActionListener, KeyListener {

	TestMap map = new TestMap();
	CreatureMaker creator = new SingleMarioMaker();
	Creature mario = creator.createCreature();

	Timer t = new Timer(5, this);

	public GraphicsPanel() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		// Малюємо карту
		for (int i = 0; i < map.getNumberOfTextures(); i++) {
			g2.drawImage(map.getPartImage(i), map.getPartCoordX(i), map.getPartCoordY(i), null);
		}
		
		// Малюємо істот
		for (int i = 0; i < map.creatures.size(); i++) {
			g2.drawImage(map.creatures.get(i).getImg(),(int)map.creatures.get(i).getPosX(),(int)map.creatures.get(i).getPosY(), null);
		}
		
		// Малюємо Маріо
		g2.drawImage(mario.getImg(), (int) mario.getPosX(), (int) mario.getPosY(), null);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();

		if (code == KeyEvent.VK_D) {
			mario.setSpeedX(2);
		}

		if (code == KeyEvent.VK_A) {
			mario.setSpeedX(-2);
		}

		if (code == KeyEvent.VK_SPACE) {
			if (!mario.isAbleToGoD())
				mario.setSpeedY(-5);
		}

		if (code == KeyEvent.VK_S) {
			mario.setSpeedY(4);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		int code = e.getKeyCode();
		if (code == KeyEvent.VK_D) {
			if (mario.getSpeedX() == 2)
				mario.setSpeedX(0);
		}

		if (code == KeyEvent.VK_A) {
			if (mario.getSpeedX() == -2)
				mario.setSpeedX(0);
		}

	}

	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (!mario.isAlive()) {
			t.stop();
		}

		map.updateVectors(mario);
		mario.update();
		map.murderUpdate(mario);
		
		for (int i = 0; i < map.creatures.size(); i++) {
			map.updateVectors(map.creatures.get(i));
			map.creatures.get(i).update();
		}

		
		
		if (mario.getPosX() >= 750 && mario.getSpeedX() > 0) {
			if (!map.shiftToDelta((int) mario.getSpeedX())) {
				mario.setPosX(mario.getPosX() + mario.getSpeedX());
			}
		} else {
			mario.setPosX(mario.getPosX() + mario.getSpeedX());
		}

		mario.setPosY(mario.getPosY() + mario.getSpeedY());
		repaint();
	}

}
