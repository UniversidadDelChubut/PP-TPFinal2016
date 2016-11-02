package batalla;

public abstract class Armas {
	private int daño;
	
	public Armas (int daño){
		this.daño = daño;
	}
	
	public void Usar(){}
	
	
	public int getDaño() {
		return daño;
	}
	
}
