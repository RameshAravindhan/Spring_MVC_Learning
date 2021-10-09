package com.SpringMVC.DemoProject;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

    @NameValidation(value = "Good", message = "must start with Good")
    String FirstName;

    @NotNull(message = "is required")
    @Size(min = 5, message = "is required")
    String LastName;


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

}
