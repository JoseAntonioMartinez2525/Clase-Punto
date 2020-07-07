import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Punto p1= new Punto();	Punto p2=new Punto();Punto p3=new Punto();
		int x1,x2,y1,y2;
		double d;
		System.out.println("<=================caso 1:==================>");
		p1.setX(10);p1.setY(10); 
		p2.setX(20);p2.setY(30);
		
		d=p3.distancia(p1, p2);
		System.out.println("La coordenada del punto 1 es: "+p1.toString());
		System.out.println("La coordenada del punto 2 es: "+p2.toString());
		p3.comparar(p1, p2);
		System.out.println("La distancia es: "+d);
		System.out.println("\n\n<=================caso 2:=================>");
		p1.setX(0);p1.setY(1); 
		p2.setX(0);p2.setY(1);
		
		d=p3.distancia(p1, p2);
		System.out.println("La coordenada del punto 1 es: "+p1.toString());
		System.out.println("La coordenada del punto 2 es: "+p2.toString());
		p3.comparar(p1, p2);
		System.out.println("La distancia es: "+d);
		
	}


}
