package batalla;


public class Principal {
	public static void main(String[] args) {
		//ArmasAgotables a = new NueveMM();
		
		Zulu z = new Zulu("Neymar");
		Ninja n = new Ninja();
		
		//while (/* Esten vivos*/) {
			
			n.atacar(z);
			z.atacar(n);
			
			System.out.println("La vida que le quedo a el zulu es de " + n.getNivelVida());
			System.out.println("La vida que le quedo a el ninja es de " + z.getNivelVida());
		//}
		
		
		
	}

}
