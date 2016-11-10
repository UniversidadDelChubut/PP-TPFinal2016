package batalla;

import java.util.Random;

public class Ninja extends Guerrero {
	
	public Ninja (String nombre) {
		super(100, 50, 60, "Naruto");

		 	Armas a1 = null;
			Armas a2 = null;
			
			Random r = new Random();
			
			int aux = r.nextInt(5);
					
			if (aux == 0) {
				a1 = new Shuriken();
			}
			if (aux == 1) {
				a1 = new Nunchaku();
			}
			if (aux == 2) {
				a1 = new Katana();
			}
			if (aux == 3) {
				a1 = new Kunai();
			}
			if (aux == 4) {
				a1 = new Bou();
			}
			this.setArmaPrimaria(a1);
			
			do {
				aux = r.nextInt(5);
				if (aux == 0) {
					a2 = new Shuriken();
				}
				if (aux == 1) {
					a2 = new Nunchaku();
				}
				if (aux == 2) {
					a2 = new Katana();
				}
				if (aux == 3) {
					a2 = new Kunai();
				}
				if (aux == 4) {
					a2 = new Bou();
				}
				
			} while (a2.getClass().equals(a1.getClass()));
				
			
			this.setArmaSecundaria(a2);
	}
	 
	 public Armas seleccionarArma(Guerrero Oponente) {
		return getArmaPrimaria();
	}
}
