package batalla;

public abstract class Guerrero {
	
		private int nivelVida;
		private int defensa;
		private int nivelAtaque;
		//private int estado; //GUERRERO UN ESTADO SI ES 1 ATACO y 0 NO ATACO PARA SABER SI PUEDE ATACAR DEPENDIENDO DEL ESTADO
		//private Armas armaPrimaria;
		//private Armas armaSecundaria;
		private String nombre;
		//RANDOM PERMITE TRAER UN OBJETO TIPO RANDOM new Random(); 
		/*
		public void atacar(Guerrero oponente){
		
			nivelVida =- defensa - this.nivelAtaque;
		
		}
		*/
		public abstract void seleccionarArma(Guerrero Oponente);
		

}
