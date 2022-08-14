package section2;

import java.util.ArrayList;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class School {
	private ArrayList<Classroom> classrooms;

	public School(ArrayList<Classroom> schoolRooms) {
		classrooms = schoolRooms;
	}

	public Classroom findClassroom(String teacher) {
		for(Classroom room : classrooms) {
			if(room.getTeacherName().equals(teacher)) {
				return room;
			}
		}
		return null;
	}
	public String findStudent(String teacher, int idNumber) {
		for (int k = 0; k < classrooms.size(); k++) {
			if (classrooms.get(k).getTeacherName().equals(teacher)) {
				int low = 0;
				int high = classrooms.get(k).getStudents().size() - 1;
				while (low <= high) {
					int middle = (low + high) / 2;
					if (idNumber < classrooms.get(k).getStudents().get(middle).getStudentID()) {
						high = middle - 1;
					}else if(idNumber>classrooms.get(k).getStudents().get(middle).getStudentID()) {
						low = middle+ 1; 
					}else {
						return classrooms.get(k).getStudents().get(middle).getStudentName() ; 
					}
				}
			}
		}
		return "Student not found.";
	}
}

class Classroom {
	private String roomID;
	private String teacherName;
	private ArrayList<Student> Students;

	public Classroom(String roomID) {
		this.roomID = roomID;
	}
	public Classroom(String teacher, ArrayList<Student> theStudents) {
		teacherName = teacher;
		Students = theStudents;
	}

	public Object getTeacherName() {
		// TODO Auto-generated method stub
		return teacherName;
	}

	public ArrayList<Student> getStudents() {
		// TODO Auto-generated method stub
		return Students;
	}

}

class Student {
	private String studentName;
	private int studentID;

	public Student(String name, int ID) {
		studentName = name;
		studentID = ID;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getStudentID() {
		return studentID;
	}

}