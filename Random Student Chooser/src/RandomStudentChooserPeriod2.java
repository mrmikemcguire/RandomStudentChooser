import java.util.Random;

public class RandomStudentChooserPeriod2
	{
	public static void main(String[] args)
		{
		int luckyStudent;

		String [] studentRoster = {"Jason", "Jin", "Gursev", "Karl", "Sammi", "Evan", "Harris", 
				"Nick", "Nate", "Desmond", " Louren", "Christopher", "Blake", "Michael", "Gabe", 
				"Celina", "Nathan", "Dan", "Jonothon", "Kevin", "Madeline", "Austin"};
		
		Random randomNumber = new Random();
		luckyStudent = randomNumber.nextInt(studentRoster.length);

		System.out.println("The lucky student is " + studentRoster[luckyStudent] + ".");
		}

	}