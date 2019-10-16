package br.com.facamp.COM738;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JPanel;

public class GarageCar extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private int posX;
	private int posY;
	private CarManager car;
	
	private GarageCar() {
	
//		Random r = new Random();
		setCar(new CarManager(50, 500, 129, 60));
		posX = 860;
		posY = minY();
//      r.nextInt((maxY - minY) + 1) + minY;
		this.setFocusable(false);
		
		
	}
	
	@Override
	public void paint(Graphics g) {

		//Desenhando Cenario
		
		//Fundo Estacionamento
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 1000, 600);
		
		//Fundo Rua
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 200, 700);
		
		//Faixas
		g.setColor(Color.YELLOW);
		g.fillRect(100, 30, 5, 50);
		g.fillRect(100, 120, 5, 50);
		g.fillRect(100, 210, 5, 50);
		g.fillRect(100, 300, 5, 50);
		g.fillRect(100, 390, 5, 50);
		g.fillRect(100, 480, 5, 50);
		
		//"Paredes"
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(210, 20, 730, 50);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(930, 20, 50, 520);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(210, 490, 730, 50);
		
		//Internas
		g.setColor(Color.GRAY);
		g.fillRect(220, 30, 750, 30);
		g.setColor(Color.GRAY);
		g.fillRect(940, 30, 30, 500);
		g.setColor(Color.GRAY);
		g.fillRect(220, 500, 750, 30);
		
		//Linhas das Vagas
		g.setColor(Color.WHITE);
		g.fillRect(820, 80, 100, 5);
		g.setColor(Color.WHITE);
		g.fillRect(920, 80, 5, 400);
		g.fillRect(820, 160, 100, 5);
		g.fillRect(820, 240, 100, 5);
		g.fillRect(820, 320, 100, 5);
		g.fillRect(820, 400, 100, 5);
		g.fillRect(820, 475, 100, 5);
	
//		//Cancelas
//		
		g.setColor(Color.YELLOW);
		g.fillRect(210, 80, 10, 200);
		g.setColor(Color.BLACK);
		g.fillRect(210, 80, 10, 10);
		g.fillRect(210, 95, 10, 10);
		g.fillRect(210, 110, 10, 10);
		g.fillRect(210, 125, 10, 10);
		g.fillRect(210, 140, 10, 10);
		g.fillRect(210, 155, 10, 10);
		g.fillRect(210, 170, 10, 10);
		g.fillRect(210, 185, 10, 10);
		g.fillRect(210, 200, 10, 10);
		g.fillRect(210, 215, 10, 10);
		g.fillRect(210, 230, 10, 10);
		g.fillRect(210, 245, 10, 10);
		g.fillRect(210, 260, 10, 10);
		g.fillRect(210, 275, 10, 10);
		if(GarageCar.getInstance().getCar().y  < 281 ) {
		g.setColor(Color.GRAY);
		g.fillRect(210, 80, 10, 205);
	
		}
		if(GarageCar.getInstance().getCar().x > 300 ) {
		g.setColor(Color.YELLOW);
		g.fillRect(210, 80, 10, 200);	
		g.setColor(Color.BLACK);
		g.fillRect(210, 80, 10, 10);
		g.fillRect(210, 95, 10, 10);
		g.fillRect(210, 110, 10, 10);
		g.fillRect(210, 125, 10, 10);
		g.fillRect(210, 140, 10, 10);
		g.fillRect(210, 155, 10, 10);
		g.fillRect(210, 170, 10, 10);
		g.fillRect(210, 185, 10, 10);
		g.fillRect(210, 200, 10, 10);
		g.fillRect(210, 215, 10, 10);
		g.fillRect(210, 230, 10, 10);
		g.fillRect(210, 245, 10, 10);
		g.fillRect(210, 260, 10, 10);
		g.fillRect(210, 275, 10, 10);
		}
//		
		g.setColor(Color.YELLOW);
		g.fillRect(210, 290, 10, 190);
		g.setColor(Color.BLACK);
		g.fillRect(210, 290, 10, 10);
		g.fillRect(210, 305, 10, 10);
		g.fillRect(210, 320, 10, 10);
		g.fillRect(210, 335, 10, 10);
		g.fillRect(210, 350, 10, 10);
		g.fillRect(210, 365, 10, 10);
		g.fillRect(210, 380, 10, 10);
		g.fillRect(210, 395, 10, 10);
		g.fillRect(210, 410, 10, 10);
		g.fillRect(210, 425, 10, 10);
		g.fillRect(210, 440, 10, 10);
		g.fillRect(210, 455, 10, 10);
		g.fillRect(210, 470, 10, 10);
		//g.fillRect(210, 485, 10, 10);

		if(GarageCar.getInstance().getCar().y  > 300 ) {
		g.setColor(Color.GRAY);
		g.fillRect(210, 290, 10, 190);
		}
		
		if(GarageCar.getInstance().getCar().x > 300 ) {
		g.setColor(Color.YELLOW);
		g.fillRect(210, 290, 10, 190);
		g.setColor(Color.BLACK);
		g.fillRect(210, 290, 10, 10);
		g.fillRect(210, 305, 10, 10);
		g.fillRect(210, 320, 10, 10);
		g.fillRect(210, 335, 10, 10);
		g.fillRect(210, 350, 10, 10);
		g.fillRect(210, 365, 10, 10);
		g.fillRect(210, 380, 10, 10);
		g.fillRect(210, 395, 10, 10);
		g.fillRect(210, 410, 10, 10);
		g.fillRect(210, 425, 10, 10);
		g.fillRect(210, 440, 10, 10);
		g.fillRect(210, 455, 10, 10);
		g.fillRect(210, 470, 10, 10);
		//g.fillRect(210, 485, 10, 10);
		}
		
		
		// Garage
		//Fazer a garagem ser no meio de cada uma
		g.setColor(Color.GRAY);
		g.fillRect(posX , minY(),  60, 10);
		
//		g.fillRect(posX , 200,  60, 10);
//		g.fillRect(posX , 280,  60, 10);
//		g.fillRect(posX , 360,  60, 10);
//		g.fillRect(posX , 440,  60, 10);
			
		g.setFont(new Font("SansSerif", Font.BOLD, 30));
		g.setColor(Color.BLUE);
		g.fillRoundRect(855, 100, 40, 40, 10, 10);
		g.fillRoundRect(855, 180, 40, 40, 10, 10);
		g.fillRoundRect(855, 260, 40, 40, 10, 10);
		g.fillRoundRect(855, 340, 40, 40, 10, 10);
		g.fillRoundRect(855, 420, 40, 40, 10, 10);
		
		g.setColor(Color.WHITE);
		g.drawString("P", 865, 130);
		g.drawString("P", 865, 210);
		g.drawString("P", 865, 290);
		g.drawString("P", 865, 370);
		g.drawString("P", 865, 450);
		
		g.setFont(new Font("SansSerif", Font.BOLD, 12));
		g.setColor(Color.WHITE);
		g.drawString("Posição Carro" + " X: " + car.x + "   Y: " + car.y, 240, 100);
		g.drawString("Posição Garagem" + " X: " + posX + "   Y: " + posY, 240, 120);
		// d(a,b) = RAIZ((x2 - x1)2 + (y2 - y1)2
		double x1 = (car.x - posX);
		double y2 = (car.y - posY);
		g.drawString("Distancia Carro até Garagem: " + ((Math.sqrt((x1 * x1) + (y2 * y2)))) , 240, 140);
		g.drawString("Angulo Carro: " + Math.toDegrees(GarageCar.getInstance().getCar().angleCar) + 90, 240, 160);
		
		this.repaint();
		// Chamando o carro para ser printado
		getCar().paint(g);
	}

	// Singleton
	public static GarageCar instance;

	public static GarageCar getInstance() {
		if (instance == null) {
			instance = new GarageCar();
		}
		return instance;
	}
	

	//Posições determinas, sorteio delas
	public int minY() {
	
		 ArrayList<Integer> listPosY = new ArrayList<Integer>();
		
		 listPosY.add(120);
		 listPosY.add(200);
		 listPosY.add(280);
		 listPosY.add(360);
		 listPosY.add(440);
		 
		 Collections.shuffle(listPosY);
		 return listPosY.get(0);
		
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public double getR() {
		return this.car.r;
	}

	public double getWheel() {
		return this.car.angleWheels;
	}

	public CarManager getCar() {
		return car;
	}

	public void setCar(CarManager car) {
		this.car = car;
	}
	
	


}
