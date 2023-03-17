package tc3;

public class Triangulo extends Figura {

	private double base;
	private double altura;
	
	public Triangulo(double pBase, double pAltura){
		
		base = pBase;
		altura = pAltura;
	}
	
	public double calcularArea(){
		
		return (base*altura)/3;
	}
	
public int compareTo(Triangulo triPorComparar){
		
		double areaPorComparar = triPorComparar.calcularArea();
		double miArea = this.calcularArea();
		
		int ladosPorComparar = triPorComparar.ladosFigura();
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
		
		return 3;		
	}
	
}
