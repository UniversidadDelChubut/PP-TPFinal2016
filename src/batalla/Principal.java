package batalla;

public class Principal {
	public static Guerrero pelearAMuerte(Guerrero g1, Guerrero g2) {
		while(g1.getNivelVida() >  0 && g2.getNivelVida() > 0) {
			g1.atacar(g2);
			System.out.println("El guerrero " + g1.getNombre() + " ataco con " + g1.getArmaPrimaria() + " al guerrero " + g2.getNombre());
			if (g2.getNivelVida() <= 0){
				System.out.println("El guerrero muerto fue " + g2.toString());
			} else {
				System.out.println("La vida del " + g2.toString() + " es de " + g2.getNivelVida());
			}
			g2.atacar(g1);
			System.out.println("El guerrero " + g1.getNombre() + " ataco con " + g1.getArmaPrimaria() + " al guerrero " + g2.getNombre());
			if (g1.getNivelVida() <= 0) {
				System.out.println("El guerrero muerto fue " + g1.toString());
			} else {
				System.out.println("La vida del " + g1.toString() + " es de " + g1.getNivelVida());
			}
		}
		return (g1.getNivelVida() >  0) ? g1 : g2;
	}
	
	public static void main(String[] args) {
		
		Zulu z[]= new Zulu[10];
		Marine ma[]= new Marine[10];
		Mohicano mo[]= new Mohicano[10];
		Samurai s[]= new Samurai[10];
		Ninja n[]= new Ninja[10];
		Guerrero Ganadores[]= new Guerrero[20];
		
		
		for(int i= 0; i < 10; i++){
			z[i] = new Zulu("Neymar");
			ma[i] = new	Marine("Bonifacini");
			mo[i] = new Mohicano("Leroyer");
			s[i] = new Samurai("Nogueira");
			n[i] = new Ninja("Vera");	
		}
		
		for(int i= 0; i < 10; i++){
			Ganadores[i] = pelearAMuerte(n[i], z[i]);
		}
		
		for(int i= 0; i < 10; i++){
			Ganadores[i+10] = pelearAMuerte(mo[i], s[i]);
		}
		
		for(int i= 0; i < 20; i++){	
			System.out.println("GANADORES " + i + " " + Ganadores[i]);
		}
		
		for(int i= 0; i < 10; i++){
			Ganadores[i] = pelearAMuerte(Ganadores[i], ma[i]);
		}
		for(int i= 0; i < 10; i++){
			Ganadores[i] = pelearAMuerte(Ganadores[i], Ganadores[i+10]);
		}
		for(int i= 0; i < 10; i++){
		System.out.println("GANADORES " + i + " " + Ganadores[i]);
		
		}
		
		
		
		
		
		
	}
}