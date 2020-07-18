import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}


class Student extends Person{
	private int[] testScores;
    char a;
    int average=0;
    Student(String firstName,String lastName,int id,int [] testScores)
    {
        super(firstName ,lastName,id);
        this.testScores=testScores;
        for(int i : testScores)
        {
            average+=i;
        }
        average/=(testScores.length);
    }
    char calculate()
    {
        if(average>=90 && average<=100)
        {
           a='O';
        }
        else if(average>=80 && average<90)
        {
             a='E';
        }
        else if(average>=70 && average<80)
        {
            a='A';
        }
        else if(average>=55 && average<70)
        {
           a='P';
        }
        else if(average>=40 && average<55)
        {
            a='D';
        }
        else if(average<40)
        {
            a='T';
        }
        return a;
    }
}

class Inheritance{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}