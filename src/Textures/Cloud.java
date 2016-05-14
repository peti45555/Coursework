package Textures;

import java.awt.Image;

public class Cloud extends Texture{
	
	public Cloud() {
		super("/Textures/Cloud.png", 120, 70);
	}
	
	public Image getImg(){
		return super.img;
	}

}
