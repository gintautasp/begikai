package begikai;

public class Varzybos {
	
	public String pav;
	public Begikas[] dalyviai;
	public int kiek_dalyviu = 0;
	public int paimtas_dalyvis = 0;
	
	public double kiek_laiko_begsim;

	public Varzybos ( double kiek_laiko_begsim, String pav ) {
		
		this.pav = pav;
		this.dalyviai = new Begikas [ 200 ];
		this.kiek_laiko_begsim = kiek_laiko_begsim;
	}
	
	public void pridetiDalyvi ( String vardas, double km_per_12min ) {
		
		this.dalyviai [ kiek_dalyviu ] = new Begikas ( vardas, km_per_12min );
		kiek_dalyviu++;
	}
	
	/**
	 * rikiuojam burbuliuko metodu
	 */
	public void rezultatai() {
		
		boolean flag_nesurikiuota = false;
		
		while ( ! flag_nesurikiuota ) {
			
			flag_nesurikiuota = true;  // o gal kartais gerai?
			
			for ( int i = 0; i < kiek_dalyviu - 1; i++ ) {
			
				if ( dalyviai [ i ].kiekNubego() < dalyviai [ i + 1 ].kiekNubego() ) {  // vistik negerai :(
					
					flag_nesurikiuota = false;
					
					Begikas pagalbinis = dalyviai [ i ];
					dalyviai [ i ] = dalyviai [ i + 1 ];
					dalyviai [ i + 1 ] = pagalbinis;
				}
			}
		}
	}
	
	
	public void prognozuoti () {
		
		for ( int i = 0; i < kiek_dalyviu; i++ ) {
			
			dalyviai [ i ].begtiLaika ( kiek_laiko_begsim );
		}
	}
	
	public void isPradziu () {
		
		this.paimtas_dalyvis = 0;
	}
	
	
	public boolean likoDalyviu () {
		
		return paimtas_dalyvis < ( kiek_dalyviu - 1 );
	}
	
	public Begikas imtiDalyvi ( int nr ) {
	
		paimtas_dalyvis = nr;
		
		return dalyviai [ nr ];
	}
	
}
