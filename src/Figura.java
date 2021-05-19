import excepciones.NoFigureSelectedException;
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
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} 
		
	}
	
	public void changeColor(Figura fig) throws NoFigureSelectedException{
		if(this.isObject) {
			if(this.isSelected) {
				this.colors.setR(fig.colors.getR());
				this.colors.setG(fig.colors.getG());
				this.colors.setB(fig.colors.getB());
				this.isSelected = false;
			} else {
				throw new NoFigureSelectedException("No hay una figura seleccionada");
			}
			
		} else {
			this.colors.setB((int) this.app.random(255));
			this.colors.setG((int) this.app.random(255));
			this.colors.setB((int) this.app.random(255));
		}
	}
	
	public boolean isHover() {
		// TODO Auto-generated method stub
		 boolean isSobre = false;
	      
	        if (
	            this.app.mouseX > (this.posX - (this.tamX / 2)) &&
	            this.app.mouseX < (this.posX + (this.tamX / 2)) &&
	            this.app.mouseY > (this.posY - (this.tamY / 2)) &&
	            this.app.mouseY < (this.posY + (this.tamY / 2))
	        ) {
	            isSobre = true;
	        }
	        return isSobre;
	}
	

	public boolean isObject() {
		return isObject;
	}

	public void setObject(boolean isObject) {
		this.isObject = isObject;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
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