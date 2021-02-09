package vezbaPice;

public class Main {

	public static void main(String[] args) {
		
		Pice[] pica = new Pice[3];
		
		
		Sastojak mleko = new Sastojak("Mleko", 2, 320);
		Sastojak zrnaKafe = new Sastojak("zrna kafe", 3, 120);
		Sastojak voda = new Sastojak("voda", 1, 80);
		Sastojak secer = new Sastojak("secer", 1, 90);
		Sastojak djus = new Sastojak("narandza", 1, 130);
		Sastojak alkohol = new Sastojak("alkohol", 1, 400);
		
		Pice koktel1 = new Koktel("Mohito");
		pica[0] = koktel1;
		koktel1.dodajSastojak(alkohol);
		koktel1.dodajSastojak(djus);
		koktel1.dodajSastojak(mleko);
		
		Pice koktel2 = new Koktel("Plava laguna");
		pica[1] = koktel2;
		koktel2.dodajSastojak(secer);
		koktel2.dodajSastojak(alkohol);
		koktel2.dodajSastojak(djus);

		Pice kafa1 = new Kafa("nesscafee", 10);
		pica[2] = kafa1;
		kafa1.dodajSastojak(zrnaKafe);
		kafa1.dodajSastojak(secer);
		kafa1.dodajSastojak(mleko);
		kafa1.dodajSastojak(voda);
		
		double ukupnaCenaSvihPica = 0;
		for (int i = 0; i < pica.length; i++) {
			System.out.println("Ukupna cena pica je: " + pica[i].ukupnaCenaPica());
			System.out.println("Ukupna cena svih sastojaka: " + pica[i].UkupnaCenaSvihSastojaka());
			System.out.println();
			pica[i].stampajPice();
			System.out.println("* * * * * * * * * * * * * * * * * * *");
			ukupnaCenaSvihPica = ukupnaCenaSvihPica + pica[i].ukupnaCenaPica();			
		}
		
		System.out.println("Ukupna cena svih pica je " + ukupnaCenaSvihPica);
	}

}
