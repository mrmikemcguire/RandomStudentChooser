import java.util.Random;

public class RandomStudentChooserPeriod3
	{
	public static void main(String[] args)
		{
		int luckyStudent;

		String [] studentRoster = {"Emma", "Deion", "Cole", "Justin", "Jared", "Ben", "Erin L", 
				"Bobby", "Erin M", "Ben", "Seth", "Andrew", "Jackson", "Josh", "Tristan", 
				"Jacob", "Geoffrey", "Creede"};
		
		Random randomNumber = new Random();
		luckyStudent = randomNumber.nextInt(studentRoster.length);

		System.out.println("The lucky student is " + studentRoster[luckyStudent] + ".");
		}
	}