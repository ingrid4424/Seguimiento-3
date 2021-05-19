import modelo.Color;
import processing.core.PApplet;

public abstract class Figura {

	protected int posX;
	protected int posY;
	protected int tamX;
	protected int tamY;
	protected PApplet app;
	protected Color colors;
	private boolean isObject;
	private boolean isSelected;
	
	public Figura(int posX, int posY, int tamX, int tamY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.app = app;
		this.colors = new Color();
		this.isObject = false;
		this.isSelected = false;
	}
	
	public  abstract void pintar();
	
	

	public void pintarColor() {
		try {
			this.app.fill(colors.getR(),colors.getG(),colors.getB());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
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

	public int getTamX() {
		return tamX;
	}

	public void setTamX(int tamX) {
		this.tamX = tamX;
	}

	public int getTamY() {
		return tamY;
	}

	public void setTamY(int tamY) {
		this.tamY = tamY;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	public Color getColors() {
		return colors;
	}

	public void setColors(Color colors) {
		this.colors = colors;
	}
	
	
	
	
}