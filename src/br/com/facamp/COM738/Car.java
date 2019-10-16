package br.com.facamp.COM738;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Car {

	int lengthCar = 129;
	int widthCar = 60;

	double angleWheels;
	double angleCar;

	int wheelB1;
	int wheelB2;

	int wheelF1;
	int wheelF2;

	int wheelWidth;
	int wheelLength;
	

	double x;
	double y;
	double r;

	ImageIcon ref = new ImageIcon("/home/matos/Área de trabalho/ProjectFuzzy/src/img/car.png");
	Image image = ref.getImage();

	public Image getImage() {
		return image;
	}

	public abstract void move();

	public abstract void paint(Graphics g);

	public double getAngleWheels() {
		return angleWheels;
	}

	public void setAngleWheels(double angleWheels) {
		this.angleWheels = angleWheels;
	}

}
