package Creatures;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Mario extends Creature {

	@Override
	void coordLoader() {
		super.setPosX(30);
		super.setPosY(100);
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
	void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void setImg() {
		super.currImg = img[0][1];
		
	}

	
	
	
}
