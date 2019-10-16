package br.com.facamp.COM738;

import javax.swing.JFrame;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class Main extends JFrame {

	String fileName = "/home/matos/Área de trabalho/ProjectFuzzy/src/fuzzyLogic/car.fcl";
	FIS fis = FIS.load(fileName, true);
	//Variable angle = fis.getVariable("angleWheel");
	Variable angle = fis.getVariable("angleWheel");
	Thread t;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Main();
	}
	
	Main() throws InterruptedException {
		components();
		driverCARFUZZY();
		
	}

	void components() {
		this.addKeyListener(new ControlCar());
		GarageCar ga = GarageCar.getInstance();
		add(ga);

		setSize(1000, 600);
		setTitle("Fuzzy Car");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	void driverCARFUZZY() throws InterruptedException {
		//Variable angle = fis.getVariable("angleWheel");
		while (true) {
			// Load from 'FCL' file

			// Error while loading?
			if (fis == null) {
				System.err.println("Can't load file: '" + fileName + "'");
				return;
			}

			double deltaY = (GarageCar.getInstance().getCar().y - GarageCar.getInstance().getPosY()) / 10;
			
			double angleDegree = Math.toDegrees(GarageCar.getInstance().getCar().angleCar) + 90;

			// Set inputs

			fis.setVariable("positionCar", deltaY);

			fis.setVariable("angleCar", angleDegree);

			// Evaluate
			fis.evaluate();

			// Show output variable's chart

			double aCar = angle.defuzzify();

			GarageCar.getInstance().getCar().setAngleWheels(Math.toRadians(aCar));

//       System.out.println("Angulo Carro: " + angleDegree);
//       System.out.println("AnguloW desfuzzificado: " + aCar);
//       System.out.println("AnguloW normal: " + GarageCar.getInstance().getCar().getAngleWheels());
//       System.out.println("Posição deltaY: " + deltaY);
//       System.out.println("Posição X: " + GarageCar.getInstance().getCar().x );
//       System.out.println("Posição Y: " +GarageCar.getInstance().getCar().y );

			GarageCar.getInstance().getCar().move();

			Thread.sleep(50);

		}
		
		
	 
	}
	

}
