// package com.matrizcurricular.matriz.infra.repository.entities;

// import java.io.Serializable;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "user")
// public class User {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id", nullable = false)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "id_course", referencedColumnName = "id", nullable = false)
//     private Course course;

//     @Column(name = "name", nullable = false)
//     private String name;

//     @Column(name = "email", nullable = false)
//     private String email;

//     @Column(name = "password", nullable = false)
//     private int password;

//     @Column(name = "role", nullable = false)
//     private int role;

//     public User() {
//     }

//     public User(Long id, Course course, String name, String email, int password, int role) {
//         this.id = id;
//         this.course = course;
//         this.name = name;
//         this.email = email;
//         this.password = password;
//         this.role = role;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public Course getCourse() {
//         return course;
//     }

//     public void setCourse(Course course) {
//         this.course = course;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public int getPassword() {
//         return password;
//     }

//     public void setPassword(int password) {
//         this.password = password;
//     }

//     public int getRole() {
//         return role;
//     }

//     public void setRole(int role) {
//         this.role = role;
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((id == null) ? 0 : id.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         User other = (User) obj;
//         if (id == null) {
//             if (other.id != null)
//                 return false;
//         } else if (!id.equals(other.id))
//             return false;
//         return true;
//     }
// }
