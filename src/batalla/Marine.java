package batalla;

import java.util.Random;

public abstract class Marine extends Guerrero {
	
	public Marine(int nivelVida, int defensa, String nombre) {
		super(200, 100, "PEPE");
	}
	
	public Marine() {
		Armas a1 = null;
		Armas a2 = null;
			
		Random r = new Random();
			
		int aux = r.nextInt(4);
					
		if (aux == 0) {
			a1 = new Rifle();
		}
		if (aux == 1) {
			a1 = new Ametralladora();
		}
		if (aux == 2) {
			a1 = new Lanzagranada();
		}
		if (aux == 3) {
			a1 = new NueveMM();
		}
		
		this.setArmaPrimaria(a1);
		
		do {
				
			if (aux == 0) {
				a2 = new Rifle();
			}
			if (aux == 1) {
				a2 = new Ametralladora ();
			}
			if (aux == 2) {
				a2 = new Lanzagranada();
			}
			if (aux == 3) {
				a2 = new NueveMM();
			}
			
		} while (a2.getClass().equals(a1.getClass()));
			
			

		this.setArmaSecundaria(a2);
	}
	
	 public Armas seleccionarArma(Guerrero Oponente) {
		return null;
	}
	 
}


