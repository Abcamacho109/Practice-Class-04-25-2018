import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int [] number = new int [5];
		Scanner scan = new Scanner (System.in);	
	System.out.println("Please enter 5 numbers");
	number[0]= scan.nextInt();
	number[1]= scan.nextInt();
	number[2]= scan.nextInt();
	number[3]= scan.nextInt();
	number[4]= scan.nextInt();
	
	
		for(int i = 0; i<number.length; i++){
			if(number[i] % 4 == 0 &&  number[i] % 5 == 0 &&  number[i]>10 ){
				System.out.println(number[i]);
				
			}else{
				
				
			}
				System.out.println("Not Found");
			
				}
		

	}


}