package com.nagarro.repo.rto;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "address_table")
public class AddressRto {

    @Id
    private int addressId;
    private String primaryAddress;
    private String secondaryAddress;
    private String postalCode;
    private String postOffice;

    public AddressRto() {
    }

    public AddressRto(int addressId, String primaryAddress, String secondaryAddress, String postalCode, String postOffice) {
        this.addressId = Integer.parseInt(UUID.randomUUID().toString());
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
        this.postalCode = postalCode;
        this.postOffice = postOffice;
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public String getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(String secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }
}
