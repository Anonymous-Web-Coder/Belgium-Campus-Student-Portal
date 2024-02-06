package net.codejava;


import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Simph
 */
public class studentTest {   
//  @Test
public void testCreateUser() {
    Student student = new Student();
    student.setFirstName("John");
    student.setAddress("Pretoria");
    student.setEmail("JohnDoe@gmail.com");
    student.setPassword("1234");
    student.setCourseName("LPR381");    
    /*
    The packages for these files wont intsall
    User savedUser = repo.save(student);   
    User existUser = entityManager.find(User.class, savedUser.getId());       
    assertThat(student.getEmail()).isEqualTo(existUser.getEmail());
     */
}
}


