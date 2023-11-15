package edu.gmu.springboot;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
	StudentSurvey saveStudent (StudentSurvey student);
	List<StudentSurvey> getAllStudents();
	StudentSurvey getStudentById(long id);
	StudentSurvey updateStudent (StudentSurvey student, long id); 
	void deleteStudent (long id);
}