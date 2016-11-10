package batalla;

public abstract class Guerrero {
	
		private int nivelVida;
		private int defensa;
		private int nivelAtaque;
		private String nombre;
		private Armas armaPrimaria;
		private Armas armaSecundaria;
		
		public Guerrero(int nivelVida, int defensa, int nivelAtaque, String nombre) {
			this.nivelVida = nivelVida;
			this.defensa = defensa;
			this.nivelAtaque = nivelAtaque;
			this.nombre = nombre;
		}
		public void atacar(Guerrero Oponente){
			Armas armaAtaque = this.seleccionarArma(Oponente);
			armaAtaque.Usar();
			Oponente.nivelVida = (armaAtaque.getDaño() + this.nivelAtaque) - Oponente.defensa;
/*			if (Oponente.nivelVida < 0){
			
			}else{
			
			}*/
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
		public int getNivelAtaque() {
			return nivelAtaque;
		}
}