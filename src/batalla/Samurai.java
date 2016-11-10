package batalla;

import java.util.Random;

public abstract class Samurai extends Guerrero {
	
	public Samurai(String nombre) {
		super(150, 100, 50, "Kenshi");
		Armas a1 = null;
		Armas a2 = null;
			
		Random r = new Random();
			
		int aux = r.nextInt(4);
					
		if (aux == 0) {
			a1 = new Yumi();
		}
		if (aux == 1) {
			a1 = new Arcabuz();
		}
		if (aux == 2) {
			a1 = new Naginata();
		}
		if (aux == 3) {
			a1 = new Katana();
		}
		
		this.setArmaPrimaria(a1);
		
		do {
			aux = r.nextInt(4);
			if (aux == 0) {
				a2 = new Yumi();
			}
			if (aux == 1) {
				a2 = new Arcabuz();
			}
			if (aux == 2) {
				a2 = new Naginata();
			}
			if (aux == 3) {
				a2 = new Katana();
			}
			
		} while (a2.getClass().equals(a1.getClass()));
		
		
		this.setArmaSecundaria(a2);
	}
	 
	 public Armas seleccionarArma(Guerrero Oponente) {
			return null;
	}

}
