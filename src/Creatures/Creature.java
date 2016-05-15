package Creatures;

import java.awt.Image;

public abstract class Creature {

	boolean ableToGoR,ableToGoL,ableToGoUp,ableToGoD;
	
	
	private Image currImg;
	private double posX,posY;
	private double HEIGHT,WIGHT;
	private double speedX,speedY;
	private double accY = 0.1;
	private boolean alive;
	Image [][]img = imgLoader();
	
	
	abstract Image[][] imgLoader();
	abstract void coordLoader();
	abstract void setformFactor();
	abstract void setImg();
	abstract public void update();
	
	
	public Creature() {
		alive = true;
		stop();
		imgLoader();
		coordLoader();
		setformFactor();
		setImg();
	}
	
	public void setCurrImg(Image currImg) {
		this.currImg = currImg;
	}
	public Image getImg(){
		return currImg;
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
	public Boolean isRuning(){
		if(speedX!=0){
			return true;
		}else{
			return false;
		}
	}
	public Boolean isFluying(){
		if(speedY!=0){
			return true;
		}else{
			return false;
		}
	}
	public boolean isAbleToGoL() {
		return ableToGoL;
	}
	public void setAbleToGoL(boolean ableToGoL) {
		this.ableToGoL = ableToGoL;
	}
	public boolean isAbleToGoUp() {
		return ableToGoUp;
	}
	public void setAbleToGoUp(boolean ableToGoUp) {
		this.ableToGoUp = ableToGoUp;
	}
	public boolean isAbleToGoD() {
		return ableToGoD;
	}
	public void setAbleToGoD(boolean ableToGoD) {
		this.ableToGoD = ableToGoD;
	}
	public boolean isAbleToGoR() {
		return ableToGoR;
	}
	public void setAbleToGoR(boolean ableToGoR) {
		this.ableToGoR = ableToGoR;
	}
}