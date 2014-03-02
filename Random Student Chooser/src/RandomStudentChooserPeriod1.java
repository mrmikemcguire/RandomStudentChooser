import java.util.Random;

public class RandomStudentChooserPeriod1
	{
	public static void main(String[] args)
		{
		int luckyStudent;
		

		String [] studentRoster = {"Eric", "Alec", "Evan", "Vince", "MacKenzie", "Tyler", 
				"Sean", "Vince H", "Kyle", "Matt", "Casey", "Alec", "JD", "Nguyen", "David", 
				"Kerek", "Vincent", "Shea", "Steven", "Nick", "Alex", "Austin"};
		
		Random randomNumber = new Random();
		luckyStudent = randomNumber.nextInt(studentRoster.length);
		
		System.out.println("The lucky student is " + studentRoster[luckyStudent] + ".");
		}

	}
