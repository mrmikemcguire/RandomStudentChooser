import java.util.ArrayList;
import java.util.Scanner;

public class RandomStudentChooserPeriod5
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
	studentRoster.add("Gursev");
	studentRoster.add("Tristan");
	studentRoster.add("Harris");
	studentRoster.add("Jimmy");
	studentRoster.add("Travis");
	studentRoster.add("Cole");
	studentRoster.add("Lauren");
	studentRoster.add("MacKenzie");
	studentRoster.add("Colin");
	studentRoster.add("Justin");
	studentRoster.add("Casey");
	studentRoster.add("Gabe");
	studentRoster.add("Ryan");
	studentRoster.add("Jonothon");
	studentRoster.add("Jack");
	studentRoster.add("Shea");
	studentRoster.add("Steve");
	studentRoster.add("Alex");
	studentRoster.add("A.J.");
	studentRoster.add("Creede");
	}
}
