package Textures;

import java.awt.Image;

public class Step extends Texture{

	public Step() {
		super("/Textures/Step.png", 42, 42,true);
	}
	
	public Image getImg(){
		return super.img;
	}
	
}
