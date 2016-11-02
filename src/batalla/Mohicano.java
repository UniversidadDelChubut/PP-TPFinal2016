package batalla;

public abstract class Mohicano extends Guerrero{

	public Mohicano() {
		this.setArmaPrimaria(new NueveMM());
		this.setArmaSecundaria(new NueveMM());
	}
	
	public Armas seleccionarArma(Guerrero Oponente) {
		return this.getArmaPrimaria();
	}
}
