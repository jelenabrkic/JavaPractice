package vezbaPlaninar;

public class Main {

	public static void main(String[] args) {
		
		Planina planina1 = new Planina("Tara", "Srbija", 850);
		
		RekreativniPlaninar rPlaninar1 = new RekreativniPlaninar(1, "Marko", "Markovic", 3, "Zlatiborski", 700);
		RekreativniPlaninar rPlaninar2 = new RekreativniPlaninar(2, "Petar", "Petrovic", 2, "Kolubarski", 1500);
		RekreativniPlaninar rPlaninar3 = new RekreativniPlaninar(3, "Darko", "Katic", 2, "Juznobacki", 900);
		
		Alpinista alpinista1 = new Alpinista(1, "Milan", "Milic", 2);
		Alpinista alpinista2 = new Alpinista(2, "Marija", "Bilic",11);
		Alpinista alpinista3 = new Alpinista(3, "Jelena", "Brkic", 7);
		
		Planinar[] planinari = {rPlaninar1, rPlaninar2, rPlaninar3, alpinista1, alpinista2, alpinista3};
		
		double sumaClanarina = 0;
		for (int i = 0; i < planinari.length; i++) {
			planinari[i].stampaj();
			
			if(planinari[i].uspesanUspon(planina1)) {
				System.out.println("Planinar ce se popeti na planinu " + planina1.getIme() + ".");
			} 
			else
			{ 
				System.out.println("Planinar ce se nece popeti na planinu " + planina1.getIme() + ".");
			}
			System.out.println();
			sumaClanarina = sumaClanarina + planinari[i].clanarina();			
		}
		System.out.println("Zbir svih clanarina planinara iz niza je " + sumaClanarina);
		
		
		
		
		

	}

}
