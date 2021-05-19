import java.util.ArrayList;

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
	ArrayList<Cuadrado> listaColores;
	
	public void settings() {
		size(1200,700);
	}
	
	public void setup() {
		logica = new Logica();
		circulo = new Circulo((2*width)/3, 250, 100, 100, this);
		cuadrado = new Cuadrado(width/3, 250, 100, 100, this);
		btnComparar = new Btn(width/3, 500, 150, 50, "Comparar", this);
		btnLimpiar = new Btn((2*width)/3, 500, 150, 50, "Limpiar", this);
		
		listaColores = new ArrayList<>();
		for(int i=0; i<20; i++) {
			listaColores.add(new Cuadrado(100+(i*50), 350, 50,50, this));
		}
		
		for (Cuadrado color : listaColores) {
			try {
				color.changeColor(null);
			} catch (NoFigureSelectedException e) {
				// TODO Auto-generated catch block
				error = e.getMessage();
			}
		}
		
		circulo.setObject(true);
		cuadrado.setObject(true);
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
		
		for (Cuadrado color : listaColores) {
			color.pintarColor();
			color.pintar();
		}
		
		try {
			fill(255,0,0);
			text(error, width/2,600);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());	
		}
		
	}
	
	public void mouseClicked()  {
		
		if(circulo.isHover()) {
			circulo.setSelected(true);
			System.out.println(circulo.isSelected());
			if(cuadrado.isSelected()) {
				cuadrado.setSelected(false);
			}
		}
		
		if(cuadrado.isHover()) {
			cuadrado.setSelected(true);
			System.out.println(cuadrado.isSelected());
			if(circulo.isSelected()) {
				circulo.setSelected(false);
			}
		}
		
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
		
		for (Cuadrado color : listaColores) {
			if(color.isHover()) {
				try {
					cuadrado.changeColor(color);
				} catch (NoFigureSelectedException e) {
					// TODO Auto-generated catch block
					error = e.getMessage();
				}
			}
			
		}
		
		for (Cuadrado color : listaColores) {
			if(color.isHover()) {
				try {
					circulo.changeColor(color);
				} catch (NoFigureSelectedException e) {
					// TODO Auto-generated catch block
					error = e.getMessage();
				}
			}
			
		}
	}
	
	
 
}
