package batalla;

public abstract class Armas {
	private int daño;
	
	public Armas (int daño){
		this.daño = daño;
	}
	public String toString(){
		return this.getClass().getSimpleName();
	}
	public void Usar(){

	}
	
	
	public int getDaño() {
		return daño;
	}
	
}
