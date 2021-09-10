package com.nagarro.repo.rto.user;

import javax.persistence.*;

@Entity
@Table(name = "user_information")
public class UserInformationRto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userInformationId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNUmber;

    public UserInformationRto() {
    }

    public UserInformationRto(String firstName, String lastName, String email, String phoneNUmber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNUmber = phoneNUmber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    @Override
    public String toString() {
        return "UserInformationRto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNUmber='" + phoneNUmber + '\'' +
                '}';
    }
}
