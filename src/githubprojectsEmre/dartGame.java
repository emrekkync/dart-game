package githubprojectsEmre;
import java.util.Scanner;
public class dartGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("DART GAME!");
		System.out.println("Enter the number of darts to be thrown:");
		int n = input.nextInt();
		
		int total = 0;
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countMiss = 0;
		
		
		for(int i = 1; i <= n; i++) {
			int x = (int)(Math.random() *15) -7;
			int y = (int)(Math.random() *15) -7;
			
			System.out.println("Dart " +i +":");
			
			if(x >= 0 && x <= 5 && y >= 0 && y <= 5) {
				System.out.println("Coordinates :(" + x + ", " + y + ")");
				System.out.println("Region: A");
				countA++;
				total++;
			}else if(x >= -5 && x <0 && y >= 0 && y <=5) {
				System.out.println("Coordinates :(" + x + ", " + y + ")");
				System.out.println("Region: B");
				countB++;
				total++;
			}else if(x >= -5 && x < 0 && y >= -5 && y < 0) {
				System.out.println("Coordinates :(" + x + ", " + y + ")");
				System.out.println("Region: C");
				countC++;
				total++;
			}else if(x >= 0 && x <= 5 && y >= -5 && y < 0) {
				System.out.println("Coordinates :(" + x + ", " + y + ")");
				System.out.println("Region: D");
				countD++;
				total++;
			}else {
				System.out.println("Coordinates :(" + x + ", " + y + ")");
				System.out.println("Region: Missed");
				countMiss++;
				total++;
				break;
			}
		}
		double statsA = countA * 100.0/total;
		double statsB = countB * 100.0/total;
		double statsC = countC * 100.0/total;
		double statsD = countD * 100.0/total;
		
		System.out.println();
        System.out.println("Region statistics:");
        System.out.println("Total game: " + total);
        System.out.println("A: " + countA + " dart(s) "  + statsA +"%");
        System.out.println("B: " + countB + " dart(s) " + statsB + "%");
        System.out.println("C: " + countC + " dart(s) " + statsC + "%");
        System.out.println("D: " + countD + " dart(s) " + statsD + "%");
       
        input.close();
        
       
        

	}

}
