package Textures;

import java.awt.Image;

public class Floor extends Texture{

	public Floor() {
		super("/Textures/Floor.png", 42, 42,true);
	}
	
	public Image getImg(){
		return super.img;
	}
}
