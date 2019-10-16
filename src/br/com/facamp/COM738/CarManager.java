package br.com.facamp.COM738;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.util.Random;

import javax.swing.JOptionPane;

public class CarManager extends Car {

	public CarManager(int posX, int posY, int lengthCar, int widthCar) {
		// TODO Auto-generated constructor stub
		this.x = posX;
		this.y = posY;
		this.lengthCar = lengthCar;
		this.widthCar = widthCar;
		this.wheelLength = 15;
		this.wheelWidth = 4;

		this.r = 20;
		this.angleWheels = 0.0;
		this.angleCar = 0.0;

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		// Mover para frente/cima

		if (this.y < GarageCar.getInstance().getPosY()) {
			this.angleCar = this.angleCar + this.angleWheels;
			this.x = this.x + (int) (r * Math.cos(this.angleCar));
			this.y = this.y - (int) (r * Math.sin(this.angleCar));
			this.restartCar();
		} else {
			this.angleCar = this.angleCar + this.angleWheels;
			this.x = this.x + (int) (r * Math.cos(-this.angleCar));
			this.y = this.y -(int) (r * Math.sin(this.angleCar));
			this.restartCar();
		}
	}

	@Override
	public void paint(Graphics g) {
		
		// TODO Auto-generated method stub
		//Atualiza as rodas
		this.wheelB1 = (int) (this.x - this.lengthCar / 2);
		this.wheelB2 = (int) (this.x + this.lengthCar / 2) - this.wheelLength;
		this.wheelF1 = (int) (this.y - this.widthCar / 2) - this.wheelWidth - 1;
		this.wheelF2 = (int) (this.y + this.widthCar / 2 + 2);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2.rotate(-angleCar, this.x, this.y);
		
		// Desenhando o carro
		g.drawImage(getImage(), (int) (this.x - this.lengthCar / 2), (int) (this.y - this.widthCar / 2), null);

		// Desenhando as rodas

		// Rodas Traseiras
		g.setColor(Color.BLACK);
		
		g.fillOval(this.wheelB2 - 50, this.wheelF1 + 5 / 2, this.wheelLength + 5, this.wheelWidth);

		g.fillOval(this.wheelB2 - 50, this.wheelF2 - 7, this.wheelLength + 5, this.wheelWidth);

		AffineTransform af = g2.getTransform();

		// Rodas Frente
		g.setColor(Color.BLACK);

		g2.rotate(angleWheels, (wheelB1 + wheelLength / 2), (wheelF1 + wheelWidth / 2));

		g.fillOval(this.wheelB1 + 18, this.wheelF1 + 3, this.wheelLength + 5, this.wheelWidth);

		g2.setTransform(af);
		
		g2.rotate(angleWheels, (wheelB1 + wheelLength / 2), (wheelF2 + wheelLength / 2));

		g.fillOval(this.wheelB1 + 18, this.wheelF2 - 8, this.wheelLength + 5, this.wheelWidth);

	}

	public void restartCar() {
		
		int minX = 1, maxX = 100;
		int minY = 10, maxY = 600;
		Random r = new Random();
		Rectangle re = new Rectangle();
		re.setBounds(GarageCar.getInstance().getPosX(), GarageCar.getInstance().getPosY() - ((lengthCar + 10) / 2), (widthCar + 25), (lengthCar + 5));
		
		if (re.contains(x - 25, y)) {
		JOptionPane.showMessageDialog(null, "Carro estacionado!");
			
		this.x = r.nextInt((maxX - minX) + 1) + minX;
		this.y = r.nextInt((maxY - minY) + 1) + minY;

		GarageCar.getInstance().setPosY(GarageCar.getInstance().minY());

		}
		
		//Precaução 
		if (this.x > 1000 || this.x < 0 || this.y > 1000 || this.y < 0) {

		this.x = r.nextInt((maxX - minX) + 1) + minX;
		this.y = r.nextInt((maxY - minY) + 1) + minY;

		GarageCar.getInstance().setPosY(GarageCar.getInstance().minY());

		}
	}

}
