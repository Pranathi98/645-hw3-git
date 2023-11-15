package edu.gmu.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

public StudentRepository StudentRepository;

@Autowired
public StudentServiceImpl(StudentRepository StudentRepository) {
	super();
	this.StudentRepository = StudentRepository; 
}


@Override
public StudentSurvey saveStudent(StudentSurvey studentSurvey) {

return StudentRepository.save(studentSurvey);

}

@Override
public List<StudentSurvey> getAllStudents() {

	return StudentRepository.findAll();
}

@Override
public StudentSurvey getStudentById(long id) {
    return StudentRepository.findById(id)
            .get(); 
}

@Override
public StudentSurvey updateStudent(StudentSurvey student, long id) {   
    StudentSurvey existingStudent = StudentRepository.findById(id).get();
    existingStudent.setFirstName(student.getFirstName());
    existingStudent.setLastName(student.getLastName());
    existingStudent.setEmail(student.getEmail());
    existingStudent.setCity(student.getCity());
    existingStudent.setState(student.getState());
    existingStudent.setStreetAddress(student.getStreetAddress());
    existingStudent.setDateOfSurvey(student.getDateOfSurvey());
    existingStudent.setLikedMost(student.getLikedMost());
    existingStudent.setRecommendLikelihood(student.getRecommendLikelihood());
    return StudentRepository.save(existingStudent);
}

@Override
public void deleteStudent(long id) {
	
    StudentRepository.deleteById(id);
}
}