package tc3;

public class Geometrias {
	
	public static void main(String[] args) {

		Rectangulo[] rects = new Rectangulo[3];
		Triangulo[] trias = new Triangulo[3];
		Circulo[] circs = new Circulo[3];
		
		rects[0] = new Rectangulo(4.2, 3);
		rects[1] = new Rectangulo(12, 6.1);
		rects[2] = new Rectangulo(7.3, 21.5);
		//Arrays.sort(rects);
		
		for(int i=0;i!=3;i++) {
			Rectangulo rect = rects[i];
			System.out.println(rect.toString());
		}
		
		trias[0] = new Triangulo(32, 16);
		trias[1] = new Triangulo(10.2, 4.4);
		trias[2] = new Triangulo(5, 7);
		//Arrays.sort(trias);
		
		for(int i=0;i!=3;i++) {
			Triangulo tri = trias[i];
			System.out.println(tri.toString());
		}
		
		circs[0] = new Circulo(9);
		circs[1] = new Circulo(16);
		circs[2] = new Circulo(7);
		//Arrays.sort(circs);
		
		for(int i=0;i!=3;i++) {
			Circulo circ = circs[i];
			System.out.println(circ.toString());
		}
		
	}

}
