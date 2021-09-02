package com.nagarro.repo.rto;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class UserDataRto {

    @Id
    private String userId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressRto address;

    public UserDataRto() {
    }

    public UserDataRto(String userId, AddressRto address) {
        this.userId = userId;
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AddressRto getAddress() {
        return address;
    }

    public void setAddress(AddressRto address) {
        this.address = address;
    }
}
