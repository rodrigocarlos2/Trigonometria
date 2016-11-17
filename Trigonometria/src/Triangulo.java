
public class Triangulo {
	
	private int a, b, c;
	
	public Triangulo(boolean eRetangulo, int a, int b, int c){
		
		if(eRetangulo){
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else{
			a = b = c = 0;
		}
		
	}
	
	public void setA(int a){
		this.a = a;
	}
	
	public void setB(int b){
		this.b = b;
	}
	
	public void setC(int c){
		this.c = c;
	}
	
	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
	
	public int getC(){
		return c;
	}
	
	public void show(){
		System.out.println("Lado A: "+a);
		System.out.println("Lado B: "+b);
		System.out.println("Lado C: "+c);
	}

}