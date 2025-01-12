package pavanu.code.mvcapp.service;

import java.util.List;

import pavanu.code.mvcapp.model.Student;

/**
 * Student Service Interface for Simple Spring MVC CRUD App
 * 
 * @author Pavan Uppuluri
 */
public interface StudentService {

	Student getStudent(Long id);

	Long saveStudent(Student st);

	List<Student> listAllStudents();

	void update(Long id, Student st);

	void delete(Long id);

	boolean isStudentUnique(Long id);
}
