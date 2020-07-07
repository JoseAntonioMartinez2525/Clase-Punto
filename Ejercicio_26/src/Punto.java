
public class Punto {
	private int x;
	private int y;
	
	public Punto() {
		this.x=0;
		this.y=0;
	}
	
	public Punto(int p1, int p2) {
		this.x=p1;
		this.y=p2;		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void comparar(Punto a,Punto b) {
		int x1=a.getX();int y1=a.getY();
		int x2=b.getX();int y2=b.getY();
		if (x1==x2&&y1==y2) 
			System.out.println("La coordenada es la misma");
		else
			System.out.println("La coordenada es diferente");	
	}
	
	public double distancia(Punto a,Punto b) {

		int x1,x2,y1,y2;
		x1=a.getX();y1=a.getY();
		x2=b.getX();y2=b.getY();
		
		double dis= Math.hypot(x2-x1, y2-y1);;
		return dis;
		
	}
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
}
