package Creatures;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mushroom extends Creature{

	int run = 0;
	
	public Mushroom() {
		super.setSpeedX(-1);
	}
	
	@Override
	void coordLoader() {
		super.setPosX(10);
		super.setPosY(10);
	}

	@Override
	void setformFactor() {
		super.setHEIGHT(40);
		super.setWIGHT(40);
	}

	@Override
	Image[][] imgLoader() {
		Image[][] img = {
				{ new ImageIcon(getClass().getResource("/Mushroom/Mushroom_l.png")).getImage(),
				  new ImageIcon(getClass().getResource("/Mushroom/Mushroom_r.png")).getImage() },
				 };
		return img;
	}

	

	@Override
	void setImg() {
		super.setCurrImg(img[0][1]);
	}

	@Override
	public void update() {
	
		run++;
		if(run < 35){
			super.setCurrImg(img[0][0]);
		}
		if(run >= 35){
			super.setCurrImg(img[0][1]);
		}
		if(run > 70){
			run = 0;
		}
		
		if(super.isAbleToGoL()==true && super.isAbleToGoR()==false){
			super.setSpeedX(-1);
		}
		if(super.isAbleToGoR()==true && super.isAbleToGoL()==false){
			super.setSpeedX(1);
		}
		if(super.isAbleToGoR()==false && super.isAbleToGoL()==false && super.isAbleToGoUp()){
			super.setSpeedX(0);
			super.setSpeedY(3);
		}
		super.setPosY(super.getPosY() + super.getSpeedY());
		super.setPosX(super.getPosX() + super.getSpeedX());
		
		
	}

}
