package Textures;

import java.awt.Image;

public class Marble extends Texture{
	
	public Marble() {
		super("/Textures/Marble.png", 42, 42);
	}
	
	public Image getImg(){
		return super.img;
	}

}
