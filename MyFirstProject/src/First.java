
public class First {
	
	int a;
	int b;
	int addition;
	int mult;
	double div;
	float f;
	double d;
	double dd;
	String s;
	
	
	public First(int a, int b, float e, double d, String s) {
		//super();
		this.a = a;
		this.b = b;
		this.f = e;
		this.d = d;
		this.s = s;
	}
	
	public int addition(int x, int y){
		this.a = x;
		this.b = y;
		addition = x+y;
		return addition;
		
	}
	
	public int multiplication(int a, int b){
		this.a = a;
		this.b = b;
		mult = a*b;
		return mult;
		
	}	
	
	public double division(double a, double b){
		this.d = a;
		this.dd = b;
		div = a/b;
		return div;
		
	}


}

