import java.util.ArrayList;
import java.util.Scanner;

public class RandomStudentChooserPeriod4
	{
	private int luckyStudent;
	static ArrayList <String> studentRoster = new ArrayList <String>();
	
	public static void main(String[] args)
		{
		addStudents();
		while (studentRoster.size() > 0)
			{
			int randomNumber = (int) (Math.random() * studentRoster.size());
			System.out.println("Let's look at the code of " + 
					studentRoster.get(randomNumber) + ".");
			studentRoster.remove(randomNumber);
			Scanner fake = new Scanner(System.in);
			String fakeVariable = fake.nextLine(); 
			}
		}
	
	public static void addStudents()
	{
	studentRoster.add("Sami");
	studentRoster.add("Chris");
	studentRoster.add("Grace");
	studentRoster.add("Jared");
	studentRoster.add("Connor");
	studentRoster.add("Alec");
	studentRoster.add("Jiaxin");
	studentRoster.add("Erin");
	studentRoster.add("Nathan");
	studentRoster.add("Seth");
	studentRoster.add("Zoe");
	studentRoster.add("Quinn");
	}
}
