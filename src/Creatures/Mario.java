package Creatures;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Mario extends Creature {

	int run=0;
	
	@Override
	void coordLoader() {
		super.setPosX(0);
		super.setPosY(500);
	}

	@Override
	void setformFactor() {
		super.setHEIGHT(62);
		super.setWIGHT(32);
	}

	@Override
	Image[][] imgLoader() {
		Image [][]img = 
			{
			{new ImageIcon(getClass().getResource("/Mario/Mario_lstay.png")).getImage(),
			 new ImageIcon(getClass().getResource("/Mario/Mario_rstay.png")).getImage()},
				{new ImageIcon(getClass().getResource("/Mario/Mario_ljump.png")).getImage(),
				 new ImageIcon(getClass().getResource("/Mario/Mario_rjump.png")).getImage()},
					{new ImageIcon(getClass().getResource("/Mario/Mario_lrun1.png")).getImage(),
					 new ImageIcon(getClass().getResource("/Mario/Mario_lrun2.png")).getImage(),
					 new ImageIcon(getClass().getResource("/Mario/Mario_lrun3.png")).getImage()},
						{new ImageIcon(getClass().getResource("/Mario/Mario_rrun1.png")).getImage(),
						 new ImageIcon(getClass().getResource("/Mario/Mario_rrun2.png")).getImage(),
						 new ImageIcon(getClass().getResource("/Mario/Mario_rrun3.png")).getImage()}
				};	
		return img;
	}
	
	@Override
	void setImg() {
		super.setCurrImg(img[0][1]);
		
	}
	@Override
	public void update() {
		
		if(super.isAbleToGoD()){
			if(super.getSpeedX()>=0)
				super.setCurrImg(img[1][1] );
			if(super.getSpeedX()<0)
				super.setCurrImg(img[1][0] );
		}
		if(!super.isAbleToGoD()&&super.getSpeedX()!=0){
				if(super.getSpeedX()>0){
					super.setCurrImg(img[3][run]);
				}else{
					super.setCurrImg(img[2][run]);
				}
				run++;
				if(run==3){
				run=0;}	
		}
		if(super.getSpeedX()==0 && super.getSpeedY()==0){
			super.setCurrImg(img[0][1] );
		}
	}
}
