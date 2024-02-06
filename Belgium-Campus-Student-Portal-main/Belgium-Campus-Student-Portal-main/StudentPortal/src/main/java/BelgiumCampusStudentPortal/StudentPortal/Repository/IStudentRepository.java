package BelgiumCampusStudentPortal.StudentPortal.Repository;

import BelgiumCampusStudentPortal.StudentPortal.Entity.StudentTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<StudentTable, Integer> {
}
