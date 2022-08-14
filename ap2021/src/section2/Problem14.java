package section2;

import java.util.ArrayList;

public class Problem14 {


	public static void main(String[] args) {
		School1 school = new School1();
		Elective e = new Elective("Astronomy", 12, 12);
		school.addElective(e);
		e = new Elective("Ballroom Dance", 20, 3);
		school.addElective(e);
		e = new Elective("Basket Weaving", 15, 14);
		school.addElective(e);
		e = new Elective("Constitutional Law", 10, 7);
		school.addElective(e);
		e = new Elective("Marine Biology", 10, 10);
		school.addElective(e);
		e = new Elective("Programming", 18, 18);
		school.addElective(e);
		
		Student2 s = new Student2("Andrew","Programming","Marine Biology","Ballroom Dance");
		school.addStudent(s);
		s = new Student2("David","Constitutional Law","Basket Weaving","Programming");
		school.addStudent(s);
		s = new Student2("Elizabeth","Marine Biology","Programming","Astronomy");
		school.addStudent(s);
		s = new Student2("Ethan","Basket Weaving","Marine Biology","Astronomy");
		school.addStudent(s);
		s = new Student2("Katharine","Programming","Basket Weaving","Marine Biology");
		school.addStudent(s);

		school.assignElectivesToStudents(); 
		System.out.println(school.getElectiveList());
		System.out.println(school.studentsWithoutElectives());
	}

}

class School1{
	private ArrayList<Elective> electiveList = new ArrayList<>();
	private ArrayList<Student2> studentList = new ArrayList<>();
	
	// Sample code (a)
	private Elective getElectiveByName (String name) {
		for(int eIndex = 0; eIndex < this.getElectiveListSize() ; eIndex++) {
			Elective e = electiveList. get (eIndex);
			String eName = e.getName();
			if (name.equals(eName)) {
				return e;
			}
		}
		return null;
	}

	public void addStudent(Student2 s) {
		studentList.add(s);
	}

	private int getElectiveListSize() {
		return electiveList.size();
	}

	// Sample code (b)
	public void assignElectivesToStudents() {
		for (int sIndex =0; sIndex < this.getStudentListSize() ; sIndex++) {
			Student2 s = studentList.get (sIndex) ;
			int choice= 0;
			while (choice < 3 && s.hasElective()) {
				String name = s.getChoice (choice) ;
				Elective e = getElectiveByName(name) ; 
				if (e.getClassSize() < e.getMaxClassSize( ) ) {
					e.addstudent(s);
					s.assignElective(e); 
					System.out.println(s + " - " + e);
					break;
				}
				choice ++;
			}
		}
			
	}

	private int getStudentListSize() {
		return studentList.size();
	}
	
	public ArrayList<Student2> studentsWithoutElectives() {
		ArrayList<Student2> result = new ArrayList<Student2>();
		for (int sIndex = 0;sIndex < this.getStudentListSize () ; sIndex++) {
			Student2 s = studentList.get (sIndex);
			if(s.hasElective()) {
				result.add(s);
			}
		}
		return result;
	}
	
	public void addElective(Elective e) {
		electiveList.add(e);
	}

	public ArrayList<Elective> getElectiveList() {
		return electiveList;
	}

	public ArrayList<Student2> getStudentList() {
		return studentList;
	}
	
}

class Elective {
	private String name;
	private int max;
	private int current;
	
	public Elective(String name, int max, int current) {
		this.name = name;
		this.max = max;
		this.current = current;
	}

	public String getName() {
		return name;
	}

	public void addstudent(Student2 s) {
		current++;		
		s.clearElective();
	}

	public int getMaxClassSize() {
		return max;
	}

	public int getClassSize() {
		return current;
	}

	@Override
	public String toString() {
		return "Elective [name=" + name + ", max=" + max + ", current=" + current + "]";
	}


}

class Student2{
	private String name;
	private ArrayList<String> choices = new ArrayList<>();
//	private String first;
//	private String second;
//	private String third;
	
	public Student2(String name, String first, String second, String third) {
		this.name = name;
//		this.first = first;
//		this.second = second;
//		this.third = third;
		choices.add(first);
		choices.add(second);
		choices.add(third);
	}
	

	public void clearElective() {
		choices.clear();
	}


	public boolean hasElective() {
		return choices.size()>0;
	}

	public void assignElective(Elective e) {
//		choices.add(e.getName());
		
	}

	public String getChoice(int index) {
		return choices.get(index);
	}


	@Override
	public String toString() {
		return "Student [" + name + "]";
	}
	
}