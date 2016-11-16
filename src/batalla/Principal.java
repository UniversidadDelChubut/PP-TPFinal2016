package batalla;

public class Principal {
	public static void main(String[] args) {
		
		Zulu z[]= new Zulu[10];
		Marine ma[]= new Marine[10];
		Mohicano mo[]= new Mohicano[10];
		Samurai s[]= new Samurai[10];
		Ninja n[]= new Ninja [10];
		
		for(int i= 0; i < 10; i++){
			z[i] = new Zulu("Neymar");
			ma[i] = new	Marine("Bonifacini");
			mo[i] = new Mohicano("Leroyer");
			s[i] = new Samurai("Nogueira");
			n[i] = new Ninja("Vera");
			
		}
		
		//Zulu z = new Zulu("Neymar");
		//Ninja n = new Ninja("Naruto");
		while(z[0].getNivelVida() > 0 && n[0].getNivelVida() > 0) {
			n[0].atacar(z[0]);
			if (z[0].getNivelVida() <= 0){
				System.out.println("EL GUERRERO A MUERTO ES ZULU");
			} else {
				System.out.println("La vida que le quedo a el zulu es de " + z[0].getNivelVida());
			}
			z[0].atacar(n[0]);
			if (n[0].getNivelVida() <= 0){
				System.out.println("EL GUERRERO A MUERTO ES NINJA");
			} else {
				System.out.println("La vida que le quedo a el ninja es de " + n[0].getNivelVida());
			}
		}
		if(z[0].getNivelVida() > 0){
			System.out.println("El ganador fue zzuluu con " + z[0].getNivelVida());
		}else{
			System.out.println("el ganador fue el ninja con " + n[0].getNivelVida());

		}
	
		
	}

}
