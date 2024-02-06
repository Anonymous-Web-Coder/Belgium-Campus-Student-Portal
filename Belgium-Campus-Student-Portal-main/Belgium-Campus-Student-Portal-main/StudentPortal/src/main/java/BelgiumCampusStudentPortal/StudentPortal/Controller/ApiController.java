package BelgiumCampusStudentPortal.StudentPortal.Controller;

import BelgiumCampusStudentPortal.StudentPortal.Entity.StudentTable;
import BelgiumCampusStudentPortal.StudentPortal.Service.AdminService;
import BelgiumCampusStudentPortal.StudentPortal.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class ApiController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private StudentService studentService;

 // Login/Sign Page
     @GetMapping("/login-signup")
     public String loginView() {
         return "login-signup";
     }

// Admin View
     @GetMapping("/admin-view")
     public String adminView() {
            return "admin-view";
        }

// Admin View: Admin Profile
    @GetMapping("/admin-view/admin-profile")
    public String adminProfile() {
        return "admin-profile";
    }

// Admin View: Student Info
    @GetMapping("/admin-view/student-info")
    public ModelAndView getAllStudents() {
        List<StudentTable> studentList = studentService.getAllStudents();
        return new ModelAndView("admin-student-info", "students", studentList);
    }

// Admin View: Student Registration
    @GetMapping("/admin-view/student-registration")
    public String studentRegistration() {
        return "admin-student-registration";
    }

// Admin View: Student Registered
    @PostMapping("/admin-view/student-register")
    public String studentRegistered(@ModelAttribute StudentTable student, Model model) {
        if (studentService.checkEmailExists(student.getStudent_Email())) {
            model.addAttribute("emailExists", true);
            return studentRegistration();
        } else {
            studentService.saveStudent(student);
            return "redirect:/admin-view/student-info";
        }
    }

// Admin View: Delete Student
    @RequestMapping("/delete-student/{student-id}")
    public String deleteStudent(@PathVariable("student-id") int StudentID) {
         studentService.deleteStudentById(StudentID);
         return "redirect:/admin-view/student-info";
    }

// Admin View: Update Student
    @RequestMapping("/update-student/{student-id}")
    public String updateStudent(@PathVariable("student-id") int StudentID, Model model) {
        StudentTable studentTable = studentService.getStudentById(StudentID);
        model.addAttribute("Student", studentTable);
        return "admin-update-student";
    }

// Admin View: Student Updated
    @PostMapping("/admin-view/student-update")
    public String studentUpdated(@ModelAttribute StudentTable student, Model model) {
        int studentID = student.getStudent_ID();

        if (studentService.checkEmailExistsForOtherStudents(studentID, student.getStudent_Email())) {
            model.addAttribute("studentEmailExists", true);
            return "redirect:/admin-view/student-info";
        } else {
            studentService.saveStudent(student);
            return "redirect:/admin-view/student-info";
        }
    }

 // Student View
    @GetMapping("/student-view")
    public String studentView() {
        return "student-view";
    }
}
