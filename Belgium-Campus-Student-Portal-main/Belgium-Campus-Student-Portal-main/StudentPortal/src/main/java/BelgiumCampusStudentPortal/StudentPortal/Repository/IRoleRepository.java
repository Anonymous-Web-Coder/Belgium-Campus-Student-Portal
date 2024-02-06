package BelgiumCampusStudentPortal.StudentPortal.Repository;

import BelgiumCampusStudentPortal.StudentPortal.Entity.RoleTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleTable, Integer> {
    RoleTable findByRoleName(String roleName);
}
