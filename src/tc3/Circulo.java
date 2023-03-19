package tc3;

public class Circulo extends Figura implements Comparable<Circulo> {

	private double radio;
	//private double diametro;
	//private double circunferencia;
	
	public Circulo(double pRadio){
		
		radio = pRadio;
		//diametro = 2*radio;
		//circunferencia = 3.14*diametro;
	}
	
	public double calcularArea(){
		
		return 3.14*(Math.pow(radio, 2));
		
	}
	
public int compareTo(Circulo circPorComparar){
		
		double areaPorComparar = circPorComparar.calcularArea();
		double miArea = this.calcularArea();
		
		int ladosPorComparar = circPorComparar.ladosFigura();
		int misLados = this.ladosFigura();
		
		if(miArea==areaPorComparar){
			
			if(misLados==ladosPorComparar) {
				return 0;
			}
			else if(misLados > ladosPorComparar){
				return 1;
			}
			else {
				return -1;
			}
		}
		else if (miArea > areaPorComparar){
			return 1;
			}
		else{
			return -1;
		}
	}
	
	public int ladosFigura() {
		
		return 0;
	}

	public String toString() { 
		
		double area = this.calcularArea();
		int lados = this.ladosFigura();
		String datos = "Area: " + area + " / Lados: " + lados;
		return datos;
		
	}
	
}
