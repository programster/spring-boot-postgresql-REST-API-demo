package org.programster.myapp;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Employee implements Serializable
{
    @Id
    @GeneratedValue
    private UUID id;
    
    @NotNull
    private String firstName;
    
    @NotNull
    private String lastName;
    
    private String email;
    
    
    // This exists for JPA
    protected Employee() {}
    
    
    public Employee(String firstName, String lastName, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    
    // Accessors
    public UUID getId() { return this.id; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String getEmail() { return this.email; }
}
