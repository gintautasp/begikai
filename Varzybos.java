package begikai;

public class Varzybos {
	
	public String pav;
	public Begikas[] dalyviai;
	public int kiek_dalyviu = 0;
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
	
	public void prognozuoti () {
		
		System.out.println ( pav + "\n" );
		
		for ( int i = 0; i < kiek_dalyviu; i++ ) {
			
			System.out.println ( 
	
				String.format ( " %20s %7.2f"
						, dalyviai [ i ].vardas
						, dalyviai [ i ].begtiLaika ( kiek_laiko_begsim ) 
				)
			);
		}
	}
}
