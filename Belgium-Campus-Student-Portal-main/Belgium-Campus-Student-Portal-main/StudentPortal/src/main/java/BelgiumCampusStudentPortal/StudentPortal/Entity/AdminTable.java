package BelgiumCampusStudentPortal.StudentPortal.Entity;

import jakarta.persistence.*;

@Entity(name = "admin")
public class AdminTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Admin_ID;
    @Column(name="Admin_FName", length=50, nullable=false)
    private String Admin_FName;
    @Column(name="Admin_LName", length=50, nullable=false)
    private String Admin_LName;
    @Column(name="User_Email", length=50, nullable=false, unique=true)
    private String User_Email;
    @Column(name="User_Password", length=50)
    private String User_Password;

    @ManyToOne
    @JoinColumn(name = "roleName", referencedColumnName = "roleName")
    private RoleTable role;

    public AdminTable() { }

    public AdminTable(String admin_FName, String admin_LName, String user_Email, String user_Password, RoleTable role) {
        Admin_FName = admin_FName;
        Admin_LName = admin_LName;
        User_Email = user_Email;
        User_Password = user_Password;
        this.role = role;
    }

    public int getAdmin_ID() {
        return Admin_ID;
    }
    public void setAdmin_ID(int admin_ID) {
        Admin_ID = admin_ID;
    }

    public String getAdmin_FName() {
        return Admin_FName;
    }
    public void setAdmin_FName(String admin_FName) {
        Admin_FName = admin_FName;
    }

    public String getAdmin_LName() {
        return Admin_LName;
    }
    public void setAdmin_LName(String admin_LName) {
        Admin_LName = admin_LName;
    }

    public String getUser_Email() {
        return User_Email;
    }
    public void setUser_Email(String user_Email) {
        User_Email = user_Email;
    }

    public String getUser_Password() {
        return User_Password;
    }
    public void setUser_Password(String user_Password) {
        User_Password = user_Password;
    }

    public RoleTable getRole() {
        return role;
    }
    public void setRole(RoleTable role) {
        this.role = role;
    }
}
