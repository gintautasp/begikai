package begikai;

public class Begikai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Varzybos begimas = new Varzybos ( 3600, "Valandos bëgimo prognozës" ); 
		
		begimas.pridetiDalyvi ( "Alius", 3 );
		begimas.pridetiDalyvi ( "Gediminas", 2.6  );		
		begimas.pridetiDalyvi ( "Aurelija", 2.7 );
		begimas.pridetiDalyvi ( "Deividas", 2.8   );
		begimas.pridetiDalyvi ( "Gintautas", 2.75  );		
		
		begimas.prognozuoti();
		begimas.rezultatai();
		
		System.out.println ( begimas.pav + "\n" );
		
		int i = 0;
		
		while ( begimas.likoDalyviu() ) {
			
			Begikas dalyvis = begimas.imtiDalyvi( i );
			
 			System.out.println ( 
 					
				String.format ( " %20s %7.2f"
						, dalyvis.vardas
						, dalyvis.kiekNubego()
				)
			);			
			i++;
		}
		
		
/*
 		
 

 		
 */
	}
}
