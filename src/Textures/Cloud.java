package Textures;

import java.awt.Image;

public class Cloud extends Texture{
	
	public Cloud() {
		super("/Textures/Cloud.png", 120, 70,false);
	}
	
	public Image getImg(){
		return super.img;
	}

}
