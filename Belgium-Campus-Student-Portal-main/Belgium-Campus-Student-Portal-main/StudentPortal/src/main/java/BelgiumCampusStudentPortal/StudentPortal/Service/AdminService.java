package BelgiumCampusStudentPortal.StudentPortal.Service;

import BelgiumCampusStudentPortal.StudentPortal.Entity.AdminTable;
import BelgiumCampusStudentPortal.StudentPortal.Entity.RoleTable;
import BelgiumCampusStudentPortal.StudentPortal.Entity.StudentTable;
import BelgiumCampusStudentPortal.StudentPortal.Repository.IAdminRepository;
import BelgiumCampusStudentPortal.StudentPortal.Repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private IAdminRepository adminRepo;
    @Autowired
    private IRoleRepository roleRepo;

    public void saveAdmin(AdminTable admin) {
        RoleTable userRole = roleRepo.findByRoleName("ADMIN");
        admin.setRole(userRole);
        adminRepo.save(admin);
    }
}
