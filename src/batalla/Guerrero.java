package batalla;

public abstract class Guerrero {
	
		private int nivelVida;
		private int defensa;
		private int nivelAtaque;
		private String nombre;
		
		public Guerrero() {
			
		}
		public Guerrero(int nivelVida, int defensa, String nombre) {
			this.nivelVida = nivelVida;
			this.defensa = defensa;
			this.nombre = nombre;
		}
		
		private Armas armaPrimaria;
		private Armas armaSecundaria;
		
		//RANDOM PERMITE TRAER UN OBJETO TIPO RANDOM new Random(); 
		
		public void atacar(Guerrero oponente){
			Armas armaAtaque = this.seleccionarArma(oponente);
			armaAtaque.Usar();
			
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
		
		public String getNombre() {
			return nombre;
		}
		
		public int getNivelVida() {
			return nivelVida;
		}
		
		public int getDefensa() {
			return defensa;
		}

}
