import excepciones.NoFigureSelectedException;
import excepciones.NoSameColorException;
import modelo.Logica;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Btn btnComparar;
	Btn btnLimpiar;
	Circulo circulo;
	Cuadrado cuadrado;
	String error;
	Logica logica;
	
	public void settings() {
		size(1200,700);
	}
	
	public void setup() {
		logica = new Logica();
		circulo = new Circulo((2*width)/3, 250, 100, 100, this);
		cuadrado = new Cuadrado(width/3, 250, 100, 100, this);
		btnComparar = new Btn(width/3, 500, 150, 50, "Comparar", this);
		btnLimpiar = new Btn((2*width)/3, 500, 150, 50, "Limpiar", this);
	}
	
	public void draw()  {
		background(255);
		rectMode(CENTER);
		textAlign(CENTER,CENTER);
		
		btnComparar.pintar();
		btnLimpiar.pintar();
		
		circulo.pintarColor();
		circulo.pintar();
		
		cuadrado.pintarColor();
		cuadrado.pintar();
		
		try {
			fill(255,0,0);
			text(error, 600,height/2);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());	
		}
		
	}
	
	public void mouseClicked()  {
		if(btnComparar.isHover()) {
			
			try {
				logica.compare(cuadrado.colors, circulo.colors);
			} catch (Exception e) {
				// TODO: handle exception
				error = e.getMessage();
			}
		}
		
		if(btnLimpiar.isHover()) {
			circulo.getColors().limpiarColor();
			cuadrado.getColors().limpiarColor();
		}
	}
	
	public void changeColor() throws NoFigureSelectedException{
		if(cuadrado.colors.isColor() && circulo.colors.isColor()) {
			
		}
	}
 
}
