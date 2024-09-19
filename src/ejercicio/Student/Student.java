package ejercicio.Student;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
    	this.firstName =firstName;
    	this.lastName = lastName;
    	this.registration= registration;
    	this.grade = grade;
    	this.year = year;
    
    	
    }//constructor
    
    public Student(String firstName, String lastName, int registration) {
		this(firstName, lastName, registration, 4, 2020);
	}//constructor

    public Student(int registration, int grade, int year) {
		this("Ivan Roman", "Arratia Gatcia", registration, grade, year);
	}//constructor
    
    
    
    public void printFullName(){
        System.out.println( firstName + " " +lastName );
     }
    public boolean isApproved(){
    	
    	return grade >= 60;
    }
    
    public int changeYearIfApproved(){
        if (isApproved()) {
			year+=1;
			System.out.println("Feliciades, has aprobado, Nos vemos el siguiente año " + year );
		}
    	
        return year;
    }

	public int getGrade() {
		
		return grade;
	}

    


}

