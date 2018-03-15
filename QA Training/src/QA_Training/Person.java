package QA_Training;

public class Person {
	
	public String name;
	public int age;
	public String jobTitle;

	public Person (String name, int age, String jobTitle) {
		
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		return "Name: " + name + "Age: " + age + " Job Title: " + jobTitle;
	}
	
	
	/*public void searchName () {
		System.out.println("Tom");
		System.out.println("Dick");
		System.out.println("Harry");
	}*/
	
	public static void main(String[] args) {
		
		Person p1 = new Person ("Tom, ", 35, "Pilot");
		Person p2 = new Person ("Dick, ", 28, "Software Tester");
		Person p3 = new Person ("Harry, ", 18, "Sales Assistant");
		
		Person arrayPerson[] = new Person[3];
		
		arrayPerson[0] = p1;
		arrayPerson[1] = p2;
		arrayPerson[2] = p3;
				
		for (int i = 0; i < arrayPerson.length; i++) {
			System.out.println(arrayPerson[i]);
		}
		
		
		/*p1.searchName();
		p2.searchName();
		p3.searchName();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());*/
		
	}
}
	
