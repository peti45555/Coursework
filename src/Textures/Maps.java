package Textures;

import java.awt.Image;
import java.util.ArrayList;

public abstract class Maps {
	
	int floorX = 0,floorY = 573;
	int numberOfTextures = 0;
	int length;
	Texture floor;
	int begining = 0;
	
	public int getBegining() {
		return begining;
	}

	public void setBegining(int begining) {
		this.begining = begining;
	}

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
	 
	 public boolean ableToGoRight(double x,double y,double height,double wight){
		
		 for(int i = 0;i<numberOfTextures;i++){
			 if(x < texturesCoordX.get(i))
			 if( x < textures.get(i).getWeight()+texturesCoordX.get(i)  && x + wight > texturesCoordX.get(i) ){
				
				 if( y < textures.get(i).getHeight()+texturesCoordY.get(i) && y+height>texturesCoordY.get(i)){
					 return false;
				 }
			 }
		 }
		return true;	 
	 }
	 public boolean ableToGoLeft(double x,double y,double height,double wight){
		 if(x<1){
			 return false;
		 }
		 for(int i = 0;i<numberOfTextures;i++){
			 if(x > texturesCoordX.get(i))
			 if( x < textures.get(i).getWeight()+texturesCoordX.get(i) && x > texturesCoordX.get(i)  ){
				 if( y < textures.get(i).getHeight()+texturesCoordY.get(i) && y+height>texturesCoordY.get(i)){
					 return false;
				 }
			 }
		 }
		return true;	 
	 }
	 
	 public boolean ableToGoDown(double x,double y,double height,double wight){
		 for (int i = 0; i < numberOfTextures; i++) {
			 if(x + 3 < textures.get(i).getWeight()+texturesCoordX.get(i)  && x + wight-2 > texturesCoordX.get(i)){
				 if( y < texturesCoordY.get(i)+textures.get(i).getHeight())
				 if(y + height+3 > texturesCoordY.get(i)){
					 return false;
				 }
			 }
		} 
		 return true;
	 }
	 public boolean ableToGoUp(double x,double y,double height,double wight){
		 
		 for (int i = 0; i < numberOfTextures; i++) {
			 if(x + 2 < textures.get(i).getWeight()+texturesCoordX.get(i)  && x-2 + wight > texturesCoordX.get(i)){
				 
				 if( y - 1 < textures.get(i).getWeight()+texturesCoordY.get(i) && y+5 >textures.get(i).getWeight()+texturesCoordY.get(i) ){
					 return false;
				 }
			 }
		} 
		 return true;
		}
 


}
