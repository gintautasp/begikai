package begikai;

public class Begikas {
	
		/**
		 * 						Savybës
		 */
		
		public String vardas;
		
		public double km_per_12min;
		
		public double istvermes_koeficientas = 0.004; // atstumo sumaşëjimas nuo min.
		
		/**
		 * 						Metodai
		 */
		
		/**
		 * Specialus metodas konstriuktorius - sukurs objektà darbinëje atmintyje
		 * su nurodytomis savybëmis:
		 * @param vardas
		 * @param km_per_12min
		 */
		public Begikas(String vardas, double km_per_12min) {
			
			
			this.vardas = vardas;
			this.km_per_12min = km_per_12min;
		}
		
		/**
		 * standartinis setter'is
		 * void tipas nurodo, kad metodas nieko negraşina
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
		 * paskaièiuoja nubëgta atstumà per tam tikrà laikà
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
