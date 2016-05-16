package Textures;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;

import Creatures.Creature;
import Creatures.Mushroom;

public abstract class Maps {

	int floorX = 0, floorY = 573;
	int numberOfTextures = 0;
	int length, finallength;
	private double accY = 0.1;
	Texture floor;
	int begining = 0;
	int[] chasm;

	public ArrayList<Creature> creatures = new ArrayList<>();
	ArrayList<Texture> textures = new ArrayList<>();
	ArrayList<Integer> texturesCoordX = new ArrayList<>();
	ArrayList<Integer> texturesCoordY = new ArrayList<>();

	public Maps(Texture floor, int length, int[] chasmCoords) {
		this.length = length;
		this.finallength = length;
		this.chasm = chasmCoords;
		loadFloor(floor);
	}

	private void loadElements(Texture texture, int x, int y) {

		textures.add(texture);
		texturesCoordX.add(x);
		texturesCoordY.add(y);
		numberOfTextures++;
	}

	private void loadCreature(Creature creature, int x, int y) {

		creature.setPosX(x);
		creature.setPosY(y);
		creatures.add(creature);
	}

	public void addMushroom(int x, int y) {
		loadCreature(new Mushroom(), x, y);
	}

	public void murderUpdate(Creature mario) {
		for(int i = 0; i<creatures.size();i++){
		
			if(mario.getPosX()+mario.getWIGHT()>creatures.get(i).getPosX() ||  )
			
			
		}
	}
	
	public boolean shiftToDelta(int delta) {

		delta = -delta;
		int member;
		if (length < 1080) {
			return false;
		}
		begining += delta;
		length += delta;
		for (int i = 0; i < creatures.size(); i++) {
			creatures.get(i).setPosX(creatures.get(i).getPosX() + delta);
		}
		for (int i = 0; i < numberOfTextures; i++) {
			member = texturesCoordX.get(i);
			member += delta;
			texturesCoordX.remove(i);
			texturesCoordX.add(i, member);
		}
		return true;
	}

	public void loadFloor(Texture texture) {

		while (floorX < length) {

			for (int i = 0; i < chasm.length; i++) {
				if (chasm[i] < floorX && chasm[i] != 0) {
					chasm[i] = 0;
					floorX = (int) (floorX + texture.getWeight());
				}
			}
			textures.add(texture);
			texturesCoordX.add(floorX);
			texturesCoordY.add(floorY);
			numberOfTextures++;
			floorX = (int) (floorX + texture.getWeight());
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

	public void addCloud(int x, int y) {
		loadElements(new Cloud(), x, y);
	}

	public void addTruba(int x, int y) {
		loadElements(new Truba(), x, y);
	}

	public void addBrik(int x, int y) {
		loadElements(new Brick(), x, y);
	}

	public void addMarble(int x, int y) {
		loadElements(new Marble(), x, y);
	}

	public void addStep(int x, int y) {
		loadElements(new Step(), x, y);
	}

	public int getBegining() {
		return begining;
	}

	public void setBegining(int begining) {
		this.begining = begining;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean ableToGoRight(double x, double y, double height, double wight) {
		if (x > length - wight - 10) {
			return false;
		}
		for (int i = 0; i < numberOfTextures; i++) {
			if (!textures.get(i).isVisible()) {
				continue;
			}
			if (x < texturesCoordX.get(i))
				if (x < textures.get(i).getWeight() + texturesCoordX.get(i) && x + wight > texturesCoordX.get(i)) {

					if (y < textures.get(i).getHeight() + texturesCoordY.get(i) && y + height > texturesCoordY.get(i)) {
						return false;
					}
				}
		}
		return true;
	}

	public boolean ableToGoLeft(double x, double y, double height, double wight) {

		if (x + 1 <= begining) {
			return false;
		}

		for (int i = 0; i < numberOfTextures; i++) {
			if (!textures.get(i).isVisible()) {
				continue;
			}
			if (x > texturesCoordX.get(i))
				if (x < textures.get(i).getWeight() + texturesCoordX.get(i) && x > texturesCoordX.get(i)) {
					if (y < textures.get(i).getHeight() + texturesCoordY.get(i) && y + height > texturesCoordY.get(i)) {
						return false;
					}
				}
		}
		return true;
	}

	public boolean ableToGoDown(double x, double y, double height, double wight) {
		for (int i = 0; i < numberOfTextures; i++) {
			if (!textures.get(i).isVisible()) {
				continue;
			}
			if (x + 3 < textures.get(i).getWeight() + texturesCoordX.get(i) && x + wight - 3 > texturesCoordX.get(i)) {
				if (y - 3 < texturesCoordY.get(i) + textures.get(i).getHeight())
					if (y + height + 3 > texturesCoordY.get(i)) {

						return false;
					}
			}
		}
		return true;
	}

	public boolean ableToGoUp(double x, double y, double height, double wight) {

		for (int i = 0; i < numberOfTextures; i++) {
			if (!textures.get(i).isVisible()) {
				continue;
			}
			if (x + 3 < textures.get(i).getWeight() + texturesCoordX.get(i) && x - 3 + wight > texturesCoordX.get(i)) {

				if (y - 5 < textures.get(i).getWeight() + texturesCoordY.get(i)
						&& y + 3 > textures.get(i).getWeight() + texturesCoordY.get(i)) {
					return false;
				}
			}
		}
		return true;
	}

	public double getAccY() {
		return accY;
	}

	public void setAccY(double accY) {
		this.accY = accY;
	}

	public void updateVectors(Creature creature) {
		if (ableToGoRight(creature.getPosX(), creature.getPosY(), creature.getHEIGHT(), creature.getWIGHT())) {
			creature.setAbleToGoR(true);
		} else {
			creature.setAbleToGoR(false);
			if (creature.getSpeedX() == 2)
				creature.setSpeedX(0);
		}
		if (ableToGoLeft(creature.getPosX(), creature.getPosY(), creature.getHEIGHT(), creature.getWIGHT())) {
			creature.setAbleToGoL(true);
		} else {
			creature.setAbleToGoL(false);
			if (creature.getSpeedX() == -2)
				creature.setSpeedX(0);
		}
		if (ableToGoDown(creature.getPosX(), creature.getPosY(), creature.getHEIGHT(), creature.getWIGHT())) {
			creature.setAbleToGoD(true);
			creature.setSpeedY(creature.getSpeedY() + getAccY());
		} else {
			creature.setAbleToGoD(false);
			if (creature.getSpeedY() > 0)
				creature.setSpeedY(0);
		}
		if (ableToGoUp(creature.getPosX(), creature.getPosY(), creature.getHEIGHT(), creature.getWIGHT())) {
			creature.setAbleToGoUp(true);
		} else {
			creature.setAbleToGoUp(false);
			if (creature.getSpeedY() < 0)
				creature.setSpeedY(0);
		}
		if (!creature.isAbleToGoR() && !creature.isAbleToGoL()) {
			creature.setPosY(creature.getPosY() - 2);
		}

	}

}
