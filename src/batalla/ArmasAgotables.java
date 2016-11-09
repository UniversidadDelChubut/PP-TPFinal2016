package batalla;

public abstract class ArmasAgotables extends Armas {

	private int cantMax;
	private int cantMuniciones;
	
	public ArmasAgotables(int daño, int cantMax) {
		super(daño);
		this.cantMax= cantMax;
		this.cantMuniciones = cantMax;
	}
	
	public void Usar(){
		if(this.cantMuniciones > 0){
			this.cantMuniciones--; 
		}
	}
	
	public int getCantMax() {
		return cantMax;
	}
	public int getCantMuniciones(){
		return cantMuniciones;
	}
}
