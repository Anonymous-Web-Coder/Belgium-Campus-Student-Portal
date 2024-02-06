package BelgiumCampusStudentPortal.StudentPortal.Service;

import BelgiumCampusStudentPortal.StudentPortal.Entity.RoleTable;
import BelgiumCampusStudentPortal.StudentPortal.Entity.StudentTable;
import BelgiumCampusStudentPortal.StudentPortal.Repository.IRoleRepository;
import BelgiumCampusStudentPortal.StudentPortal.Repository.IStudentRepository;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository studentRepo;
    @Autowired
    private IRoleRepository roleRepo;

    public void saveStudent(StudentTable student) {
        RoleTable userRole = roleRepo.findByRoleName("USER");
        student.setRole(userRole);
        studentRepo.save(student);
    }
    public List<StudentTable> getAllStudents() { return studentRepo.findAll(); }
    public void deleteStudentById(int Student_ID) { studentRepo.deleteById(Student_ID); }
    public StudentTable getStudentById(int Student_ID) { return studentRepo.findById(Student_ID).orElse(null); }
    public boolean checkEmailExists(String email) {
        List<StudentTable> studentList = getAllStudents();
        return studentList.stream().anyMatch(student -> student.getStudent_Email().equalsIgnoreCase(email));
    }
    public boolean checkEmailExistsForOtherStudents(int studentID, String email) {
        List<StudentTable> studentList = getAllStudents();

        return studentList.stream()
                .filter(student -> student.getStudent_ID() != studentID) // Exclude the student being updated
                .anyMatch(student -> student.getStudent_Email().equalsIgnoreCase(email));
    }
}
