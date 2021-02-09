package vezbaPice;

public abstract class Pice {
	
	protected String nazivPica;
	protected Sastojak[] sastojci = new Sastojak[10];
	protected int n = 0;
	
	public Pice(String nazivPica) {
		super();
		this.nazivPica = nazivPica;
	}
	
	public String getNazivPica() {
		return nazivPica;
	}

	public void setNazivPica(String nazivPica) {
		this.nazivPica = nazivPica;
	}

	public void dodajSastojak(Sastojak sastojak)
	{
		if(this.n < 10)
		{
			this.sastojci[n] = sastojak;
			this.n++;
		}
	}
	
	public int UkupnaCenaSvihSastojaka()
	{
		int suma = 0;
		for(int i = 0; i < this.n; i++)
		{
			suma = suma + this.sastojci[i].cenaSastojka();
		}
		return suma;
	}


	public abstract double ukupnaCenaPica();
	
	public abstract void stampajPice();
	
	
	

}
