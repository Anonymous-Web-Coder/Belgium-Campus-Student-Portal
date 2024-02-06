package BelgiumCampusStudentPortal.StudentPortal.Service;

import BelgiumCampusStudentPortal.StudentPortal.Repository.IAdminRepository;
import BelgiumCampusStudentPortal.StudentPortal.Repository.IStudentRepository;
import BelgiumCampusStudentPortal.StudentPortal.Repository.IRoleRepository;
import BelgiumCampusStudentPortal.StudentPortal.Entity.AdminTable;
import BelgiumCampusStudentPortal.StudentPortal.Entity.RoleTable;
import BelgiumCampusStudentPortal.StudentPortal.Entity.StudentTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IStudentRepository studentRepo;

    @Autowired
    private IAdminRepository adminRepo;

    @Autowired
    private IRoleRepository roleRepo;

    public void createStudentWithUserRole(StudentTable student) {
        RoleTable userRole = roleRepo.findByRoleName("USER");
        student.setRole(userRole);
        studentRepo.save(student);
    }

    public void createAdminWithAdminRole(AdminTable admin) {
        RoleTable adminRole = roleRepo.findByRoleName("ADMIN");
        admin.setRole(adminRole);
        adminRepo.save(admin);
    }
}
