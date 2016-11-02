package batalla;


public class Principal {
	public static void main(String[] args) {
		ArmasAgotables a = new NueveMM();
		a.Usar();
		System.out.println("Cantidad de valas es " + a.getCantMuniciones() + " asd " );
		a.Usar();
		System.out.println("Cantidad de valas es " + a.getCantMuniciones() + " asd " );
		a.Usar();
		System.out.println("Cantidad de valas es " + a.getCantMuniciones() + " asd " );
		a.Usar();
		System.out.println("Cantidad de valas es " + a.getCantMuniciones() + " asd " );
		a.Usar();
		System.out.println("Cantidad de valas es " + a.getCantMuniciones() + " asd " );
		
		/*
		Armas arma = this.getArmaPrimaria(); 
		arma.getCantMuniciones();
		if (arma instanceof ArmaAgotable)  {
			NueveMM nmm = (Nueve Milimetros) arma;
			if(nmm.getCantMuniciones() > 0){
				return arma;
			}
		}
		*/
		
		
		
	}

}
