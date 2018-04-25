import java.util.Scanner;

public class Bowls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] changes = new int [10];		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter 10 numbers");
		
		for (int j = 0; j<changes.length; j++)
			
		{
			
			changes[j] = scan.nextInt();
			System.out.println("The array of 10 numbers are as follows" + changes[j]);
			
		}
		
		/*changes[0]= scan.nextInt();
		changes[1]= scan.nextInt();
		changes[2]= scan.nextInt();
		changes[3]= scan.nextInt();
		changes[4]= scan.nextInt();
		changes[5]= scan.nextInt();
	    changes[6]= scan.nextInt();
	    changes[7]= scan.nextInt();
	    changes[8]= scan.nextInt();
	    changes[9]= scan.nextInt();*/
		
		int sum = 0;
		
		for(int i =0; i<changes.length; i++ )
		{
	    	
			sum = (sum + changes[i]);
			
	    }
		System.out.println("The sum of the values of this Array is" + sum);
	}

}
