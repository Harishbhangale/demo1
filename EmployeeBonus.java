package Day3;

import java.util.Scanner;

/*wap to check 

if salary between 10000 & 30000 bonus 10%
if salary between 30000 & 50000 bonus 12%
else
 bonus 13%


*/
public class EmployeeBonus {

	public static void main(String[] args) {
		
		double salary,bonus;
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter salary");
		// here we will take input from user 
		salary= s.nextDouble();
		//in if we will check if salary entered by user is between 10000 & 30000
		// then give bonus of 10%
		if(salary>=10000 && salary<=30000)  
			bonus= salary * .10;
		
		else if( salary>30000 && salary<=50000)
			 bonus= salary*.12;
		else
			 bonus= salary*.13;
		
		//these three line are used to display output to user
		System.out.println(" employee salary  is ="  + salary);
		System.out.println("bonus ="+ bonus);
		System.out.println("total ="+ (salary+bonus));
		
		
		
				

	}

}
