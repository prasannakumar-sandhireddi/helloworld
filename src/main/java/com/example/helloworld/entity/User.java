package com.example.helloworld.entity;

//@Entity
public class User {

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) */
    private Long id;

    private String name;
    private String email;

    // No-argument constructor
    public User() {
    }

    // Parameterized constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }
}
