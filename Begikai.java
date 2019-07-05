package begikai;

public class Begikai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Begikas alius = new Begikas ( "Alius", 3 ); 				// kuriamas bëgiko (Begikas) tipo objektas alius
		Begikas aurelija = new Begikas ( "Aurelija", 2.7 );			// ir visi kiti
		Begikas gediminas = new Begikas ( "Gediminas", 2.6 );		
		Begikas deividas = new Begikas ( "Deividas", 2.8 );
		Begikas gintautas = new Begikas ( "Gintautas", 2.75 );
		
		double kiek_laiko_begsim = 3600;
		
		System.out.println (
				
					"Valandos bëgimo prognozës \n"
					 + alius.vardas + " " +  alius.begtiLaika ( kiek_laiko_begsim ) + "\n"
					 + aurelija.vardas + " " +  aurelija.begtiLaika ( kiek_laiko_begsim ) + "\n"
					 + gediminas.vardas + " " +  gediminas.begtiLaika ( kiek_laiko_begsim ) + "\n"
					 + deividas.vardas + " " +  deividas.begtiLaika ( kiek_laiko_begsim ) + "\n"					 
					 + gintautas.vardas + " " + gintautas.begtiLaika ( kiek_laiko_begsim ) + "\n"
				);
		
	}

}
