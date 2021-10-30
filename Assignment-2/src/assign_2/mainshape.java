package assign_2;

abstract class shape
{
		public void draw() {
			System.out.println("Draw all Shapes");
		}
}
class line extends shape
{
	public void line() {
		System.out.println("Drawing line");
	}
}
class rectangle extends shape
{
	public void rectangle() {
		System.out.println("Drawing rectangle");
	}
}
class cube extends shape
{
	public void cube() {
		System.out.println("Drawing cube");
	}
}

public class mainshape {
	public static void main(String args[]) {
		
	line l=new line();
	l.line();
	rectangle rec=new rectangle();
	rec.rectangle();
	cube C=new cube();
	C.cube();
	}
}

