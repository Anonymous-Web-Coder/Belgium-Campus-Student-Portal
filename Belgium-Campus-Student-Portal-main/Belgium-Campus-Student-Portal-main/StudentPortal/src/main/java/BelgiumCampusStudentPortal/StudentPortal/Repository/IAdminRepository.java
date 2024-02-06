package BelgiumCampusStudentPortal.StudentPortal.Repository;

import BelgiumCampusStudentPortal.StudentPortal.Entity.AdminTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends JpaRepository<AdminTable, Integer> {
}
