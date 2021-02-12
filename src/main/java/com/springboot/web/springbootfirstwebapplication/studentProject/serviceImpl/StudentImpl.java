/**
 * 
 */
package com.springboot.web.springbootfirstwebapplication.studentProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.web.springbootfirstwebapplication.common.MapObject;
import com.springboot.web.springbootfirstwebapplication.studentProject.dto.StudentDTO;
import com.springboot.web.springbootfirstwebapplication.studentProject.entity.Student;
import com.springboot.web.springbootfirstwebapplication.studentProject.repository.StudentRepository;
import com.springboot.web.springbootfirstwebapplication.studentProject.service.StudentService;

/**
 * @author mangl
 *
 */
//@Component
public class StudentImpl {}
/*implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Override
	public void addStudent(List<StudentDTO> students, StudentDTO studentdto) {
		// TODO Auto-generated method stub
		if(!(null==studentdto))
		{
			students.add(studentdto);
			System.out.println( "Student record for "+ studentdto.getName() + " is added in the student list");
		}
		Student st = MapObject.modelMapper.map(studentdto, Student.class);
		st = studentRepository.save(st);
		if(!(st.equals(null)))
		System.out.println(studentdto.getName() + " saved successfully");
	}

	
	 * @Override public List<StudentDTO> getAllStudent() { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public StudentDTO getStudentById(List<StudentDTO> students, int id)
	 * { // TODO Auto-generated method stub //searching student object for related
	 * id; for(StudentDTO student:students) { if(student.getId()==id) return
	 * student; } return null; }
	 * 
	 * @Override public List<StudentDTO> getStudentByName() { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public List<StudentDTO> getStudentByAge() { // TODO Auto-generated
	 * method stub return null; }
	 

}
*/