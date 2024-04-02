package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) { //7 is injecting student as we dont need the global variable just injects without create it

		return runner -> {
			//createStudent(studentDAO);
			//findById(studentDAO,3);
			//readAllStudent(studentDAO);
			//findByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			deleteAll(studentDAO);
			//createMultipleStudents(studentDAO);

		};
	}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println(studentDAO.deleteAll());
	}

	private void deleteStudent(StudentDAO studentDAO) {
		System.out.println(studentDAO.deleteStudent(3));
	}

	private void updateStudent(StudentDAO studentDAO) {
		System.out.println(studentDAO.changeFirtName("Antonio", 4));
	}

	private void findByLastName(StudentDAO studentDAO) {
		List<Student> theStyudents = studentDAO.fibdByLastName("Doe");
		for (Student student: theStyudents){
			System.out.println(student);
		}
	}

	private void readAllStudent(StudentDAO studentDAO) {
		List<Student> theStyudents = studentDAO.readStudents();
		for (Student student: theStyudents){
			System.out.println(student);
		}

	}

	private void findById(StudentDAO studentDAO, int id) {
		System.out.println(studentDAO.findById(id));
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple students
		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		// save the student objects
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}


}







