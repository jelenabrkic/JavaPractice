package vezbaFigura;

public abstract class Figura {

	
	public abstract double povrsina();
	
	public abstract double obim();
	
	public void stampa()
	{
		System.out.println("Povrsina je " +  povrsina() + ", a obim je " + obim());
	}
}
