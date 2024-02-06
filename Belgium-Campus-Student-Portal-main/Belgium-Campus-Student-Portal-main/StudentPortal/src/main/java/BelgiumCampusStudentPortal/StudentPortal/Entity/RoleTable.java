package BelgiumCampusStudentPortal.StudentPortal.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles", uniqueConstraints = {@UniqueConstraint(columnNames = "roleName")})
public class RoleTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String roleName;

    public RoleTable() { }

    public RoleTable(String roleName) {
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
