package vezbaFigura;

public class JednakostranicniTrougao extends Figura {
	
	private double a;

	public JednakostranicniTrougao(double a) {
		super();
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double povrsina() {
		 
		return (a * a) * 1.73205 / 4;
	}

	@Override
	public double obim() {
		
		return 3 * a;
	}

	
	
	

}
