package ejercicio.Main;
import ejercicio.Courses.Courses;
import ejercicio.Student.Student;

public class Main {
	public static void main(String[] args) {
		

        Student student1 = new Student("Juan Luis", "Perez Gonzalez", 12345, 85, 2023);
        Student student2 = new Student("Ana Isabel", "Gomez Garcia", 67890, 55, 2023);
        Student student3 = new Student("Luis Pedro", "Rodriguez Hernandez", 11121, 75, 2023);
        
        Student[] studentsArray = {student1, student2, student3};
        
        	for (int i = 0; i < studentsArray.length; i++) {
        		studentsArray[i].printFullName();
			}
        	
//			for (Student student : studentsArray) {
//   		student.printFullName();
//			}
//        student1.printFullName();
//        student2.printFullName();
//        student3.printFullName();

        System.out.println("Estudiante 1 aprobado: " + student1.isApproved());
        System.out.println("Estudiante 2 aprobado: " + student2.isApproved());
        System.out.println("Estudiante 3 aprobado: " + student3.isApproved());

    
        student1.changeYearIfApproved();
        student2.changeYearIfApproved();
        student3.changeYearIfApproved();

  
        Courses course = new Courses();
        course.setCourseName("Matemáticas");
        course.setProfessorName("Dr. Ramirez");
        course.setYear(2023);

//        course.enroll(student1);
//        course.enroll(student2);
//        course.enroll(student3);
        
        
        course.enroll(studentsArray);

        System.out.println("Número de estudiantes inscritos: " + course.countStudents());


        System.out.println("Mejor calificación: " + course.bestGrade());


        course.unEnroll(student2);
        System.out.println("Número de estudiantes inscritos después de desinscribir a uno: " + course.countStudents());
	}
	

}
