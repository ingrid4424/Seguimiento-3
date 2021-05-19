import processing.core.PApplet;
import processing.core.PConstants;

public class Cuadrado extends Figura{

	public Cuadrado(int posX, int posY, int tamX, int tamY, PApplet app) {
		super(posX, posY, tamX, tamY, app);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		app.rectMode(PConstants.CENTER);
		app.rect(posX, posY, tamX, tamY);
	}

}