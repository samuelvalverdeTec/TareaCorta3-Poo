package tc3;

import java.util.ArrayList;

public class Geometrias {
	
	public static void main(String[] args) {
		
		ArrayList<Figura> rectangulos = new ArrayList<Figura>();
		ArrayList<Figura> triangulos = new ArrayList<Figura>();
		ArrayList<Figura> circulos = new ArrayList<Figura>();

		rectangulos.add(new Rectangulo(4, 3));
		rectangulos.add(new Rectangulo(12, 6));
		rectangulos.add(new Rectangulo(7, 21));
		
		triangulos.add(new Triangulo(32, 16));
		triangulos.add(new Triangulo(10, 4));
		triangulos.add(new Triangulo(5, 7));
		
		circulos.add(new Circulo(6));
		circulos.add(new Circulo(19));
		circulos.add(new Circulo(8));
		
	}

}
