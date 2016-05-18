package Textures;

public abstract class Texture {
	
	double weight,height;
	String path;
	boolean visible;
	
	public Texture(String path,double weight,double height,boolean visible) {
		this.height = height;
		this.weight = weight;
		this.path = path;
		this.visible = visible;
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

	public boolean isVisible() {
		return visible;
	}
	

	
}
