package BelgiumCampusStudentPortal.StudentPortal.Entity;

import jakarta.persistence.*;

@Entity(name = "student")
public class StudentTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student ID")
    private int Student_ID;
    @Column(name="Student FName", length=50, nullable=false)
    private String Student_FName;
    @Column(name="Student LName", length=50, nullable=false)
    private String Student_LName;
    @Column(name="Student Address", length=50, nullable=false)
    private String Student_Address;
    @Column(name="Student Email", length=50, nullable=false, unique = true)
    private String Student_Email;
    @Column(name="Student Password", length=50)
    private String Student_Password;

    @Column(name="Student_Course", length=50, nullable=false)
    private String Student_Course;

    @ManyToOne
    @JoinColumn(name = "roleName", referencedColumnName = "roleName")
    private RoleTable role;

    public StudentTable() { }

    public StudentTable(String student_FName, String student_LName, String student_Address, String student_Email, String student_Password, String student_Course, RoleTable role) {
        Student_FName = student_FName;
        Student_LName = student_LName;
        Student_Address = student_Address;
        Student_Email = student_Email;
        Student_Password = student_Password;
        Student_Course = student_Course;
        this.role = role;
    }

    public int getStudent_ID() {
        return Student_ID;
    }
    public void setStudent_ID(int student_ID) {
        Student_ID = student_ID;
    }

    public String getStudent_FName() {
        return Student_FName;
    }
    public void setStudent_FName(String student_FName) {
        Student_FName = student_FName;
    }

    public String getStudent_LName() {
        return Student_LName;
    }
    public void setStudent_LName(String student_LName) {
        Student_LName = student_LName;
    }

    public String getStudent_Address() {
        return Student_Address;
    }
    public void setStudent_Address(String student_Address) {
        Student_Address = student_Address;
    }

    public String getStudent_Email() {
        return Student_Email;
    }
    public void setStudent_Email(String student_Email) {
        Student_Email = student_Email;
    }

    public String getStudent_Password() {
        return Student_Password;
    }
    public void setStudent_Password(String student_Password) {
        Student_Password = student_Password;
    }

    public String getStudent_Course() {
        return Student_Course;
    }
    public void setStudent_Course(String student_Course) {
        Student_Course = student_Course;
    }

    public RoleTable getRole() {
        return role;
    }
    public void setRole(RoleTable role) {
        this.role = role;
    }
}
