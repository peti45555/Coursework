package Textures;

import java.awt.Image;
import java.util.ArrayList;

public abstract class Maps {
	
	int floorX = 0,floorY = 573;
	int numberOfTextures = 0;
	int length;
	Texture floor;
	
	public void setLength(int length) {
		this.length = length;
	}

	ArrayList<Texture> textures = new ArrayList<>();
	ArrayList<Integer> texturesCoordX = new ArrayList<>();
	ArrayList<Integer> texturesCoordY = new ArrayList<>();

	
	public Maps(Texture floor,int length) {
		this.length = length;
		loadFloor(floor);
	}
	
private void loadElements(Texture texture,int x,int y) {
		
		textures.add(texture);
		texturesCoordX.add(x);
		texturesCoordY.add(y);
		numberOfTextures++;
	}

public void loadFloor(Texture texture){	
	while (floorX<length) {
			textures.add(texture);
			texturesCoordX.add(floorX);
			texturesCoordY.add(floorY);
			numberOfTextures++;
			floorX = (int) (floorX + new Brick().getWeight());	 
	}
}

public int getNumberOfTextures() {
	return numberOfTextures;
}
public int getLength() {
	return length;
}
public Image getPartImage(int n) {
	return textures.get(n).getImg();
}
public int getPartCoordX(int n) {
	return texturesCoordX.get(n);
}
public int getPartCoordY(int n) {
	return texturesCoordY.get(n);
}
	

	 public int getFloorX() {
	return floorX;
}

public void setFloorX(int floorX) {
	this.floorX = floorX;
}

public int getFloorY() {
	return floorY;
}

public void setFloorY(int floorY) {
	this.floorY = floorY;
}

	public void addCloud(int x,int y){
		 loadElements(new Cloud(), x, y);
	 }
	 public void addTruba(int x,int y){
		 loadElements(new Truba(), x, y);
	 }
	 public void addBrik(int x,int y){
		 loadElements(new Brick(), x, y);
	 }
	 public void addMarble(int x,int y){
		 loadElements(new Marble(), x, y);
	 }
	 public void addStep(int x,int y){
		 loadElements(new Step(), x, y);
	 }
	 
	 
 
 
 


}
