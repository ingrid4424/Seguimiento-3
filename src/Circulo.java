import processing.core.PApplet;
import processing.core.PConstants;

public class Circulo extends Figura {

	public Circulo(int posX, int posY, int tamX, int tamY, PApplet app) {
		super(posX, posY, tamX, tamY, app);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		app.rectMode(PConstants.CENTER);
		app.circle(posX, posY, tamX);
	}

	

}