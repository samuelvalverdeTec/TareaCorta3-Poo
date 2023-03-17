package tc3;

public class Rectangulo extends Figura {

	private double base;
	private double altura;
	
	public Rectangulo(double pBase, double pAltura){
		
		base = pBase;
		altura = pAltura;
	}
	
	public double calcularArea(){
		
		return base*altura;
	}
	
	public int compareTo(Rectangulo rectPorComparar){
		
		double areaPorComparar = rectPorComparar.calcularArea();
		double miArea = this.calcularArea();
		
		int ladosPorComparar = rectPorComparar.ladosFigura();
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
		
		return 4;
	}
	
}
