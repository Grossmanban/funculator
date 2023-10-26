import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		
		System.out.println(System.lineSeparator());
		Scanner scanner = new Scanner(System.in);
		
		String vvod = scanner.nextLine();
		//System.out.println(vvod);
		
		if (vvod.contains("*")) {
			
		//	System.out.println("if успешно *");
			Scanner scMult = new Scanner(vvod);
			scMult.useDelimiter("\\*");
			Double x = scMult.nextDouble();
			Double y = scMult.nextDouble();
			System.out.println(x*y);
			scMult.close();
			
		}
		else if (vvod.contains("/")) {
			
		//	System.out.println("if успешно /");
			Scanner scDiv = new Scanner(vvod);
			scDiv.useDelimiter("/");
			Double x = scDiv.nextDouble();
			Double y = scDiv.nextDouble();
			System.out.println(x/y);
			scDiv.close();
			
		}
		else if (vvod.contains("+")) {
			
	//		System.out.println("if успешно +");
			Scanner scSum = new Scanner(vvod);
			scSum.useDelimiter("\\+");
			Double x = scSum.nextDouble();
			Double y = scSum.nextDouble();
			System.out.println(x+y);
			scSum.close();
			
		}
		else if (vvod.contains("-")) {
			
		//	System.out.println("if успешно -");
			Scanner scSubtr = new Scanner(vvod);
			scSubtr.useDelimiter("-");
			Double x = scSubtr.nextDouble();
			Double y = scSubtr.nextDouble();
			System.out.println(x-y);
			scSubtr.close();
					
				}
		else if (vvod.contains("^")) {
			
			//	System.out.println("if успешно -");
			Scanner scSqr = new Scanner(vvod);
			scSqr.useDelimiter("\\^");
			Double x = scSqr.nextDouble();
			Double y = scSqr.nextDouble();
			System.out.println(Math.pow(x, y));
			scSqr.close();
						
					}
		//scanner.close();
		repeat();
		
		

		

	}
	
	public static void repeat() {
		
		main(null);

	}

}
