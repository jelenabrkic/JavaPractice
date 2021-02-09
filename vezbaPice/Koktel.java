package vezbaPice;

public class Koktel extends Pice {
	
	public Koktel(String nazivPica) {
		super(nazivPica);
	}

	@Override
	public double ukupnaCenaPica() {
		int res = this.UkupnaCenaSvihSastojaka() + (this.UkupnaCenaSvihSastojaka() * 90/100);
		return res;
	}

	@Override
	public void stampajPice() {
		System.out.println(this.getNazivPica() + " " + this.ukupnaCenaPica());
		
		for (int i = 0; i < this.n; i++) {
			System.out.println(this.sastojci[i].getNaziv() + " " + this.sastojci[i].cenaSastojka());
			
		}
	}
	
	




	
	
	

}
