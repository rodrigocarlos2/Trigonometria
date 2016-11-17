
import java.util.*;

public class Pitagoras {
	
	public void falar(){
		System.out.println("Olá, eu sou Pitágoras.");
		System.out.println("Tenho um importante teorema, se quiser pode usar!");
	}
	
	public int teorema(Triangulo t){
		
		double resultado_aux;
		int resultado_fin;
		
		resultado_aux = Math.sqrt((double)(t.getB()*t.getB()+t.getC()*t.getC()));
		
		resultado_fin = (int)resultado_aux;
		
		if((t.getB()*t.getB()+t.getC()*t.getC())==(double)resultado_fin*resultado_fin)
			return resultado_fin;
		else
			return -1;
		
	}

}
