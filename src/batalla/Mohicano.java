package batalla;

import java.util.Random;

public abstract class Mohicano extends Guerrero{

	public Mohicano (int nivelVida, int defensa, String nombre) {
		super(100, 20, "Neymar");
	}
	
	public Mohicano() {
		Armas a1 = null;
		Armas a2 = null;
			
		Random r = new Random();
			
		int aux = r.nextInt(3);
					
		if (aux == 0) {
			a1 = new FacaTumbera();
		}
		if (aux == 1) {
			a1 = new HachaMohicana();
		}
		if (aux == 2) {
			a1 = new Escopeta();
		}
		
		this.setArmaPrimaria(a1);
		
		do {
				
			if (aux == 0) {
				a2 = new FacaTumbera();
			}
			if (aux == 1) {
				a2 = new HachaMohicana();
			}
			if (aux == 2) {
				a2 = new Escopeta();
			}
			
		} while (a2.getClass().equals(a1.getClass()));
				
		
		this.setArmaSecundaria(a2);
	}
	
	
	public Armas seleccionarArma(Guerrero Oponente) {
		return null;
	}
}
