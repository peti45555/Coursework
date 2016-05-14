package Textures;

import java.awt.Image;

public class Brick extends Texture{

	public Brick() {
		super("/Textures/Brick.png", 42, 42);
	}
	
	public Image getImg(){
		return super.img;
	}
	

}
