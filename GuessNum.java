package Com.MainApp;
import java.util.Random.*;
public class GuessNum {
	public static void main(String[] args) {
		
	
		
		RandNum rand = new RandNum();
		boolean b = false;
		while(!b)
		{
		rand.takeUserInput();
		 b = rand.isCorrectNumber();
		}
		
	}

}