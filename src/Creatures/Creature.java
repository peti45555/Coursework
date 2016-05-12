package Creatures;

import java.awt.Image;

public abstract class Creature {

	private double posX,posY;
	private double HEIGHT,WIGHT;
	private double speedX,speedY;
	private double accY = 0.9;
	private boolean alive;
	Image [][]img = imgLoader();
	
	abstract Image[][] imgLoader();
	abstract void coordLoader();
	abstract void setformFactor();
	abstract void jump();
	
	
	public Creature() {
		alive = true;
		stop();
		imgLoader();
		coordLoader();
		setformFactor();
	}
	
	public void stop(){
		speedX = 0;
		speedY = 0;
	}
 	public void changeSpeedX(double a){
		speedX+=a;
	}
	public void changeSpeedY(double a){
		speedY+=a;
	}
	public double getPosX() {
		return posX;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
	public double getSpeedY() {
		return speedY;
	}
	public void setSpeedY(double speedY) {
		this.speedY = speedY;
	}
	public double getHEIGHT() {
		return HEIGHT;
	}
	public void setHEIGHT(double hEIGHT) {
		HEIGHT = hEIGHT;
	}
	public double getSpeedX() {
		return speedX;
	}
	public void setSpeedX(double speedX) {
		this.speedX = speedX;
	}
	public double getWIGHT() {
		return WIGHT;
	}
	public void setWIGHT(double wIGHT) {
		WIGHT = wIGHT;
	}
	public double getAccY() {
		return accY;
	}
	public void setAccY(double accY) {
		this.accY = accY;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	

}