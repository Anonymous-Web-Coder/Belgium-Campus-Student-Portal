package BelgiumCampusStudentPortal.StudentPortal.Service;

import BelgiumCampusStudentPortal.StudentPortal.Entity.RoleTable;
import BelgiumCampusStudentPortal.StudentPortal.Repository.IRoleRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private IRoleRepository roleRepo;

    @PostConstruct
    public void initRoles() {
        if (roleRepo.count() == 0) {
            RoleTable userRole = new RoleTable();
            userRole.setRoleName("USER");
            roleRepo.save(userRole);

            RoleTable adminRole = new RoleTable();
            adminRole.setRoleName("ADMIN");
            roleRepo.save(adminRole);
        }
    }
}