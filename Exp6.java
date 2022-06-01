class Box{
	int w,h,d;
	void setData(int x, int y, int z){
		w=x;
		h=y;
		d=z;
	}
	void display(){
		System.out.println("Width is "+w);
		System.out.println("Height is "+h);
		System.out.println("Dept is "+d);
	}
	
}

public class Exp6{

	public static void main(String arg[]){
		
		Box b1 = new Box();
		Box b2 = new Box();
		b1.setData(10,15,20);
		b1.display();
		b2.setData(3,6,9);
		b2.display();
	}
}