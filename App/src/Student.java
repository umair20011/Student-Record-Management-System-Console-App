import java.util.*;
public class Student {

	int id;
	String name;
	int marks;
	
	static ArrayList<Student> list =new ArrayList<>();
	
	Student(int id, String name, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public static void addStudent(Student s) {
		list.add(s);
	}
	
	public static void viewStudents() {
		for(Student s: list) {
			System.out.print("Student_id:"+s.id+" ");
			System.out.print("Student_name:"+s.name+" ");
			System.out.print("Student_marks:"+s.marks);
			System.out.println();
		}
	}
	
	public static void updateStudent(Student s) {
		for(Student student: list) {
			if(student.id==s.id) {
				list.remove(student);
				list.add(s);
			}
		}
	}
	
	public static void deleteStudent(int id) {
		for(Student s: list) {
			if(id==s.id) {
				list.remove(s);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student(1,"Ramesh",400);
		Student s2=new Student(2,"Aakash",240);
		Student s3=new Student(3, "Amaan",350);
		Student s4=new Student(4, "Rohit",200);
		
		addStudent(s1);
		addStudent(s2);
		addStudent(s3);
		addStudent(s4);
		
		viewStudents();
		
		deleteStudent(3);
		
		viewStudents();
		
		updateStudent(new Student(4,"Rakhi",200));
		
		viewStudents();
	}

}
