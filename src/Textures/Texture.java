package Textures;

import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Texture {
	
	public Image img;
	double weight,height;
	String path;
	
	public Texture(String path,double weight,double height) {
		this.height = height;
		this.weight = weight;
		this.path = path;
		loadTexture();
	}
	
	void loadTexture(){
		img = new ImageIcon(getClass().getResource(path)).getImage();
	}
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	
}
