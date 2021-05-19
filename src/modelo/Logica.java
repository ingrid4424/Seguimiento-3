package modelo;

import excepciones.NoFigureSelectedException;
import excepciones.NoSameColorException;

public class Logica {

	public Logica() {
		// TODO Auto-generated constructor stub
	}
	
	public void compare(Color c1, Color c2) throws NoSameColorException,NoFigureSelectedException {

		if(c1.isColor() && c2.isColor()) {
			if(!c1.getFinalColor().equals(c2.getFinalColor())) {
				throw new NoSameColorException("Error : Los colores de las figuras no son iguales");
			} else {
				throw new NoSameColorException("Correcto : Los colores de las figuras son iguales" + "Cuadrado:" + c1.getFinalColor() +"-"+ "Circulo" + c2.getFinalColor() );
			}
		} else {
			throw new NoFigureSelectedException("Error : No se han seleccionados colores");
		}
			
	}
	


	
}