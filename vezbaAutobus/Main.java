package vezbaAutobus;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		Vozac vozac1 = new Vozac("Milan", "Milic");
		vozac1.stampaVozac();
		
		List<Putnik> putnici = new ArrayList<Putnik>();
		Putnik putnik1 = new Putnik("Nikola", "Katic", 500.00);
		putnici.add(putnik1);
		
		Putnik putnik2 = new Putnik("Marija", "Savic", 400.00);
		putnici.add(putnik2);
		
		putnik1.dodajNovac(50.00);
		putnik1.stampaPutnik();
		putnik2.oduzmiNovac(100.00);
		putnik2.stampaPutnik();
		
		Putnik putnik3 = new Putnik("Jelena", "Brkic", 700.00);
		
		Autobus bus1 = new Autobus("Lasta", 300.00, vozac1, putnici);
		bus1.dodajPutnika(putnik3);
		bus1.naplatiKartu();
		bus1.stampajAutobus();
		
		bus1.ukloniPutnika("Jelena", "Brkic");
		bus1.ukloniVozaca();
		bus1.stampajAutobus();
		

	}

}
