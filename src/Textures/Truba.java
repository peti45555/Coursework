package Textures;

import java.awt.Image;

public class Truba extends Texture{

	public Truba() {
		super("/Textures/Truba.png", 96, 110);
	}
	
	public Image getImg(){
		return super.img;
	}

	
}
