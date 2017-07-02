package au.com.tpg.test.question2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Main class is used for sort Student List, run main method to print out the result in console
 * @author Tony Tian
 */
public class StudentSort {
	/**
	 * Main method for sorting init and sort student list
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * There is another way to do object sort, Student class implements Comparable<Student> interface and implement the comparable method.
		 * However, using a static comparator insides the object class can be more flexible, more Comparators with different sorting orders can be implemented.
		 */
		//init student list
		List<Student> studentList = new LinkedList<Student>();
		studentList.add(new Student(33l, "Tina", 3.68f));
		studentList.add(new Student(85l, "Louis", 3.85f));
		studentList.add(new Student(56l, "Samil", 3.75f));
		studentList.add(new Student(56l, "Samar", 3.75f));
		studentList.add(new Student(19l, "Samar", 3.75f));
		studentList.add(new Student(22l, "Lorry", 3.76f));
		
		//sort it by Student default comparator
		Collections.sort(studentList, Student.DEFAULT_SORT);
		
		//print sorted firstNames in order
		studentList.forEach(s-> System.out.println(s.getFirstName()));
	}
	
	public StudentSort() {
	}

}
