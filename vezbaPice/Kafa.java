package vezbaPice;

public class Kafa extends Pice {

	private double kolicinaKofeina;
	
	public Kafa(String nazivPica, double kolicinaKofeina) {
		super(nazivPica);
		this.kolicinaKofeina = kolicinaKofeina;
	}

	public double getKolicinaKofeina() {
		return kolicinaKofeina;
	}

	public void setKolicinaKofeina(double kolicinaKofeina) {
		this.kolicinaKofeina = kolicinaKofeina;
	}
	
	
	@Override
	public double ukupnaCenaPica() {
		return kolicinaKofeina * 30 + this.UkupnaCenaSvihSastojaka();
	}

	@Override
	public void stampajPice() {
		System.out.println("(" + this.getNazivPica() + "), (" + kolicinaKofeina + ") --- (" + ukupnaCenaPica() + ")" );
		
		for (int i = 0; i < this.n; i++) {
			System.out.println("(" + sastojci[i].getNaziv() + "), (" + sastojci[i].cenaSastojka() + ")" );	
		}
		
	}

	
	
	
	
}
