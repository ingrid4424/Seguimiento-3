package modelo;

import excepciones.NoSameColorException;

public class Logica {

	public Logica() {
		// TODO Auto-generated constructor stub
	}
	
	public void compare(Color c1, Color c2) throws NoSameColorException{

			if(!c1.getFinalColor().equals(c2.getFinalColor())) {
				throw new NoSameColorException("Los colores de las figuras no son iguales");
			} else {
				throw new NoSameColorException("Los colores de las figuras son iguales");
			}
	}
	


	
}