package BelgiumCampusStudentPortal.StudentPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class StudentPortalApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentPortalApplication.class, args);
	}
}
