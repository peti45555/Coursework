package Textures;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageContainer {
	Image brick,cloud,floor,marble,smallcastle,step,truba;

	public ImageContainer() {
		brick = new ImageIcon(getClass().getResource("/Textures/Brick.png")).getImage();
		cloud = new ImageIcon(getClass().getResource("/Textures/Cloud.png")).getImage();
		floor = new ImageIcon(getClass().getResource("/Textures/Floor.png")).getImage();
		marble = new ImageIcon(getClass().getResource("/Textures/Marble.png")).getImage();
		smallcastle = new ImageIcon(getClass().getResource("/Textures/Castle_small.png")).getImage();
		step = new ImageIcon(getClass().getResource("/Textures/Step.png")).getImage();
		truba = new ImageIcon(getClass().getResource("/Textures/Truba.png")).getImage();
	}
	
	public Image getTextureImg(Texture texture){
		
		if(texture.getPath()=="/Textures/Brick.png"){
			return brick;
		}
		if(texture.getPath()=="/Textures/Cloud.png"){
			return cloud;
		}
		if(texture.getPath()=="/Textures/Floor.png"){
			return floor;
		}
		if(texture.getPath()=="/Textures/Marble.png"){
			return marble;
		}
		if(texture.getPath()=="/Textures/Castle_small.png"){
			return smallcastle;
		}
		if(texture.getPath()=="/Textures/Step.png"){
			return step;
		}
		if(texture.getPath()=="/Textures/Truba.png"){
			return truba;
		}
		return null;
	}
	
}
