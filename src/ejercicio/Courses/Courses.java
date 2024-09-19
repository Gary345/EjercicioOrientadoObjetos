package ejercicio.Courses;
import java.util.ArrayList;
import java.util.Iterator;

import ejercicio.Student.Student;

public class Courses {
	
	private String courseName;
	private String professorName;
	private int year;
	
	ArrayList<Student> studentsEnrolled = new ArrayList<Student>();
	 	
	
//	   public void enroll(Student student){
//		   studentsEnrolled.add(student);
//		   }
	
	 public void enroll(Student[] students){
		   for (Student student : students) { 
	            studentsEnrolled.add(student);
	        }
		   }

	   public void unEnroll(Student student) {
		    if (studentsEnrolled.contains(student)) { 
		        studentsEnrolled.remove(student);      
		    }
		}

		   public int countStudents(){
			   return studentsEnrolled.size();
		   }
		   
		   public int bestGrade(){
		       
			   Iterator<Student> iterator = studentsEnrolled.iterator();// 
				int mayor= 0;
				while(iterator.hasNext()) {
					Student currentStudent = iterator.next();
					int currentGrade = currentStudent.getGrade(); // 
					if (currentGrade > mayor) {
						 mayor = currentGrade;
					}				
				}//while
			   
			   
		       return mayor;
		   }

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public String getProfessorName() {
			return professorName;
		}

		public void setProfessorName(String professorName) {
			this.professorName = professorName;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		  
}

