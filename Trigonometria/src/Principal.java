
public class Principal {
	
	public static void main(String args[]){
		
		Triangulo t = new Triangulo(false, 1, 2, 3);
		Pitagoras p = new Pitagoras();
		
		t.setA(0);
		
		t.setB(4);
		
		t.setC(3);
		
		p.falar();
		
		int hipotenusa = p.teorema(t);
		
		System.out.println("Hipotenusa calculada: "+hipotenusa);
		
	}

}
