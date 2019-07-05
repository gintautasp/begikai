package begikai;

public class Begikas {
	
		/**
		 * 						Savyb�s
		 */
		
		public String vardas;
		
		public double km_per_12min;
		
		public double istvermes_koeficientas = 0.004; // atstumo suma��jimas nuo min.
		
		/**
		 * 						Metodai
		 */
		
		/**
		 * Specialus metodas konstriuktorius - sukurs objekt� darbin�je atmintyje
		 * su nurodytomis savyb�mis:
		 * @param vardas
		 * @param km_per_12min
		 */
		public Begikas(String vardas, double km_per_12min) {
			
			
			this.vardas = vardas;
			this.km_per_12min = km_per_12min;
		}
		
		/**
		 * standartinis setter'is
		 * void tipas nurodo, kad metodas nieko negra�ina
		 * @param istvermes_koeficientas
		 */
		public void istvermesKoeficientas( double istvermes_koeficientas ) {
			
			this.istvermes_koeficientas = istvermes_koeficientas;
		}

		/**
		 * standartinis getter'is 		
		 * @return
		 */	
		public double istvermesKoeficientas() {
			
			return this.istvermes_koeficientas;
		}

		/**
		 * paskai�iuoja nub�gta atstum� per tam tikr� laik�
		 * @param laikas
		 * @return
		 */
		public double begtiLaika (double laikas) {
			
			double nubegtas_atstumas = 
					
							km_per_12min 
						* 
							(laikas / 720 ) 
						* 
							( 1 - ( this.istvermes_koeficientas * ( ( laikas - 720 ) / 60 ) ) ) 
						
						;
			return nubegtas_atstumas;
		}
}
