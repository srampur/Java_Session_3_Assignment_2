import java.util.Scanner;

/*
 * Session 3 : OOPs class & objects
Assignment 
–
Write a simple Java program to check whether a 
given number is a prime number or not
 */
public class DetectPrime {

	private boolean isPrime (int num)
	{
		for(int i =2; i<= num/2; i++)
		{
			if(num%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int num = 0;
		DetectPrime obj = new DetectPrime();
		Scanner s = new Scanner (System.in);
		num = s.nextInt();
		System.out.println("Number is " + (obj.isPrime(num) ? " Prime ":" not Prime"));
		s.close();
	}

}
