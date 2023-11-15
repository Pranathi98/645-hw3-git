package edu.gmu.springboot;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/students")
public class StudentController{
	private  StudentService studentService;
	
	
	public StudentController(StudentService studentService ) {
		super();
		this.studentService = studentService;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
   
    public String Test() {
        return "test";
    }
	
	 @RequestMapping(value = "/add", method = RequestMethod.POST) 
	public ResponseEntity<StudentSurvey> saveStudent(@RequestBody StudentSurvey student){
		return new ResponseEntity<StudentSurvey> (studentService.saveStudent(student), HttpStatus.CREATED);
	}
	
	 @RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<StudentSurvey> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<StudentSurvey> getStudentById(@PathVariable("id") long studentId){
		return new ResponseEntity<StudentSurvey> (studentService.getStudentById(studentId), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<StudentSurvey> updateStudent(@PathVariable("id") long id, @RequestBody StudentSurvey student){
		return new ResponseEntity<StudentSurvey> (studentService.updateStudent(student, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
		studentService.deleteStudent(id);
		return new ResponseEntity<String> ("Student deleted successfully", HttpStatus.OK);
	}
	
}