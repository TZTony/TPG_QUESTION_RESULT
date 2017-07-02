package au.com.tpg.test.question2;

import java.util.Comparator;

/**
 * Student class contains all required information and comparator
 * @author Tony Tian
 *
 */
public class Student {
	/**
	 * Default sort comparator, 
	 * sort it by GPA in descending order, name in alphabetical order and ID by ascending order
	 */
	public static final Comparator<Student> DEFAULT_SORT = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			if (s1.getGpa() != s2.getGpa()) {
				return Float.compare(s2.getGpa(), s1.getGpa());
			} else if (!s1.getFirstName().equals(s2.getFirstName())) {
				return s1.getFirstName().compareTo(s2.getFirstName());
			} else {
				return Long.compare(s1.getId(), s1.getId());
			}
		}
	};
	
	private long id;
	private String firstName;
	private float gpa;
	
	/**
	 * The only constructor to set id, name and GPA into Student
	 * @param id
	 * @param name
	 * @param gpa
	 */
	public Student(Long id, String firstName, float gpa) {
		this.id = id;
		this.firstName = firstName;
		this.gpa = gpa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
}
