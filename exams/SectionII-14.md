In a certain school, students are permitted to enroll in one elective class from a list of electives offered. Because there are a limited number of spaces in each class for students, and because some electives are more popular than others, a lottery system was devised by the school to assign students to electives.

Each student lists three choices for electives. The school orders the students randomly and assigns each student to the first available elective in the student’s list of three choices. If none of the three choices is available (because those electives are fully enrolled), the school does not assign the student to an elective. 

After the school attempts to assign all of the students to electives, it produces a list of students it was unable to assign. 

for example, suppose there are six electives available to students: Astronomy. Ballroom Dance, Basket Weaving, Constitutional Law, Marine Biology,and programming.

The following table shows the name, maximum enrollment, and current enrollment for six electives after 64 students have been successfully assigned to electives: 

Elective Name  | Maximum Enrollment | Current Enrollment
|---               |--- |---
Astronomy          | 12 | 12
Ballroom Dance     | 20 | 3
Basket Weaving     | 15 | 14
Constitutional Law | 10 | 7
Marine Biology     | 10 | 10
programming        | 18 | 18

Note that three electives, Astronomy* Programming, and Marine Biology, are fully enrolled and are no longer options for students. 

Now suppose that the following students need to be assigned to electives: 

Student | First Choic<br>getChoice(0) | Second Choice<br>getChoice(1) | Third Choice<br>getChoice(2)
|---|---|---|---|
Andrew    | Programming       | Marine Biology | Ballroom Dance  
David     |Constitutional Law |Basket Weaving  | programming
Elizabeth |Marine Biology     |Programming     | Astronomy 
Ethan     |Basket Weaving     |Marine Biology  | Astronomy
Katharine |Programming        |Basket Weaving  | Marine Biology  

Andrew’s first and second choices are fully enrolled, but his third choice has openings. Andrew will be enrolled in Ballroow Dance.

David’s first choice has openings. David will be enrolled in Constitutional Law. 

All three of Elizabeth’s choices are fully enrolled. Elizabeth will remain unassigned to an elective. 

Ethan’s first choice has one opening left. Ethan will be enrolled in Basket Weaving. Note that Basket Weaving is now fully enrolled 

All three of Katharine’s choices are now fully enrolled. Katharine will remain unassigned to an elective. 

In this problem, the school is modeled by the class school. Students and electives are modeled by the classes Student and Elective, respectively.

The School class includes the following methods and private data: 

* studentList — This ArrayList holds the list of students in the order in which the students should be scheduled. 
* electiveList — This ArrayList holds the electives that students may choose. 
* getElectiveByName — This method returns the Elective in electiveList with the given name.
* assignElectivesToStudents — This method encapsulates the functionality of assigning students (if possible) their first, second, or third elective choice. 
* studentsWithoutElectives — This method returns an Arrayist containing students that have not been assigned an elective.

```java
publicclass School 
{
    private Arraylist<Student> studentList;
    // each element is an instance of a 
    // Student representing one student 
    // at the school; students are in 
    // the order they should be scheduled 

    private ArrayList<Elective> electiveList;
    // each element is an instance of an 
    // Elective representing one elective 
    // offered at the school 

    // precondition: name is the name of an 
    // Elective in electiveList 
    // postcondition: returns the Elective 
    // in electiveList with the given 
    //name

    private Elective getElectiveByName (string name)  
    { /* to be implemented in part (a) */}

    // postcondition: returns the size 
    // of electiveList 
    private int getElectiveListSize() 
    {
        return electiveList.size() ;
    }
    private int getStudentListsize() 
    {
        return studentList.size ();
    }

    // postcondition: All Students in 
    //stude ntl-i st have been either 
    // assigned their first available 
    // elective choice or not assigned; 
    // All Electives in electiveList have 
    // been updated appropriately as 
    // Students are assigned to them 
    public void assignElectivesToStudents ( ) 
    { /* to be implemented in part (b) */ }

    // postcondition: returns a list of 
    // those Students who have not been 
    // assigned an Elective 
    public ArrayList<Student> studentsWithoutElectives()
    { /* to be implemented in part (c) */} 

// constructors, other methods, 
// and other private data not shown 
}
```

The Student class includes the following methods and private data: 
* getChoice — This method returns the name of the given elective choice of the student. The first elective choice has index 0, the second has index 1, and the third has index 2.  
* hasElective — This method returns true if the student has been assigned an elective; it returns false otherwise. 
* assignElective — This method assigns the given elective to this student. 

```java
public class student 
{
    // precondition: 0<= index < 3
    // postcondition: returns the name 
    // of the given elective choice 
    public String getChoice(int index) 
    {/* code not shown*/}

    // postcondition: returns true if 
    // an Elective has been assigned 
    // to this Student 
    public boolean hasElective()
    { /* code not shown*/ } 

    // precondition: e is not null 
    // postcondition: e has been assigned 
    // to this Student; e has not been   
    // modified 
    public void assignElective (Elective e ) 
    { /* code not shown*/ } 

//... constructors,other methods, 
// and other private data not shown 
}
```

The Elective class includes the following methods: 
* getName — This method returns the name of this elective. 
* getMaxClassSize — This method returns the maximum number of students that can be assigned to this elective. 
* getClassSize — This method returns the number of students that have been assigned to this elective. 
* addstudent — This method assigns the given student to this elective. 

```java
public class Elective
{
    private String name; 
    private int maxClassSize;
    private int classSize;
    private ArrayList studentList = new ArrayList() ;

    // postcondition: returns the name 
    // of this Elective 
    public String getName()
    { /* code not shown*/ } 

    //  postcondition: returns the     
    // maximum number of Students 
    // that can be added to this 
    // Elective 
    public int getMaxClasssize ()
    { /* code not shown */ }

    //postcondition: returns the 
    //number of Students that have  
    // been added to this Elective; 
    // 0 < = getClassSize() <=
    // getMaxClassSize()
    public int getClassSize ()
    { /* code not shown */ }

    // precondition: getClassSize ()< 
    // getMaxClassSize ( ); s is not null 
    // postcondition: s has been added to 
    // this Elective; getClassSize () has 
    //
    // been increased t>y 1
    public void addstudent (Student s ) 
    {/*code not shown*/}

    // constructors, other methods, and other private data not shown  
} 
```

(a) Write the School method getElectiveByName. Method getElectiveByName should return the Elective in ElectiveList that has the given name. 

Complete method getElectiveByName below. 

```java
// precondition: name is the name of an 
// Elective in electiveList 
// postcondition: returns the Elective in 
// electiveList with the given name 
private Elective getElectiveByName (String name) 
```

(b) Write the School method assignElectivesToStudents. Method assignElectivesToStudents should assign electives to students as described at the beginning of this question.

In writing method assignElectivesToStudents, you may use the private helper method getElectiveByName specified in part (a). Assume that getElectiveBybJame works as specified, regardless of what You wrote in part (a). Solutions that reimplement functionality provided by this method, rather than invoking it, will not receive full credit.

Complete method assignElectivesTostudents below 

```java
//postcondition: All Students in 
// studentListhave been either 
// assigned their first available 
// elective choice or not assigned; 
// All electives in electiveListhave 
//  been updated appropriately as 
// Students are assigned to them 
public void assignElectivesToStudents() 

```

(c) Write the School method studentsWithoutElectives. Method studentsWithoutElectives should return Ar raYList of all Students in studentList who do not have an Elective assigned to them. 

Complete method studentsWithoutElectives below 

```java
// postcondition: returns a list of those 
// Students who have not been as signed 
// an Elective 
public ArrayList studentsWithoutElectives ()
```

