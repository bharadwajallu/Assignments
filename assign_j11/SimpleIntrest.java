package assign_j11;

public class SimpleIntrest {

	public static void main(String[] args) {
		var P=500;
		var R=3;
		var T=2;
		CalculateSI obj = (var a,var b,var c) -> (a*b*c)/100;
		System.out.println(obj.sI(P, R, T));
	}

}

interface CalculateSI{
	double sI(double P,double R,double T);
}