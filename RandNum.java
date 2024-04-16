package Com.MainApp;

import java.util.Random;
import java.util.Scanner;
public class RandNum {
		public int number;
		public int inputNumber;
		public int noOfGuess=0;
		Scanner sc = new Scanner(System.in);
	RandNum()
	{
			 Random  Rand = new Random();
			 this.number = Rand.nextInt(100);
	}

	public int getNoOfGuess()
		{
			return noOfGuess;
		}

	public void setNoOfGuess(int noOfGuess)
		{
			this.noOfGuess = noOfGuess;
		}
		
	void takeUserInput()
	{
		System.out.println("Guess the number");
		inputNumber = sc.nextInt();
		System.out.println("Input Number is "+inputNumber);
	
	}
	
	boolean isCorrectNumber() {
		noOfGuess++;
		if(inputNumber==number) {
			System.out.format("Yes you guessed it right,it was %d\n you guessed it in %d attempts",number,noOfGuess);
			return true;
		}
		else if(inputNumber<number) {
			System.out.println("To..less");
		}
		else if(inputNumber>number) {
			System.out.println("To..High");
		}
		  	return false;
	}
		

}