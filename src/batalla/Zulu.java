package batalla;

import java.util.Random;

public class Zulu extends Guerrero {
	
	public Zulu(String nombre) {
		super(100, 50, 1,"Mr popo");

		Armas a1 = null;
		Armas a2 = null;
			
		Random r = new Random();
			
		int aux = r.nextInt(3);
					
		if (aux == 0) {
			a1 = new Iklwa();
		}
		if (aux == 1) {
			a1 = new Iwisa();
		}
		if (aux == 2) {
			a1 = new HachaZulu();
		}
		this.setArmaPrimaria(a1);
		
		do {
			aux = r.nextInt(3);
			if (aux == 0) {
				a2 = new Iklwa();
			}
			if (aux == 1) {
				a2 = new Iwisa();
			}
			if (aux == 2) {
				a2 = new HachaZulu();
			}
			
		} while (a2.getClass().equals(a1.getClass()));
		
		this.setArmaSecundaria(a2);
	}
	 
	 public Armas seleccionarArma(Guerrero Oponente) {
		 
		if(getArmaPrimaria() != null) {
			return getArmaPrimaria();
		} else {
			return getArmaSecundaria();
	 	}
	}

}
