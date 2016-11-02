package batalla;

public abstract class Guerrero {
	
		private int nivelVida;
		private int defensa;
		private int nivelAtaque;
		private Armas armaPrimaria;
		private Armas armaSecundaria;
		private String nombre;
		//RANDOM PERMITE TRAER UN OBJETO TIPO RANDOM new Random(); 
		
		public void atacar(Guerrero oponente){
			Armas armaAtaque = this.seleccionarArma(oponente);
			armaAtaque.Usar();
			nivelVida =- defensa - this.nivelAtaque;
		}
	
		public abstract Armas seleccionarArma(Guerrero Oponente);
		
		protected void setArmaPrimaria(Armas armaPrimaria) {
			this.armaPrimaria = armaPrimaria;
		}
		
		protected void setArmaSecundaria(Armas armaSecundaria) {
			this.armaSecundaria = armaSecundaria;
		}
		
		public Armas getArmaPrimaria() {
			return armaPrimaria;
		}
		
		public Armas getArmaSecundaria() {
			return armaSecundaria;
		}

}
