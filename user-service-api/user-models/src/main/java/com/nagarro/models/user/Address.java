package com.nagarro.models.user;




public class Address {

    private int addressId;
    private String primaryAddress;
    private String secondaryAddress;
    private String postalCode;
    private String postOffice;

    public Address() {
    }

    public Address(int addressId, String primaryAddress, String secondaryAddress, String postalCode, String postOffice) {
        this.addressId = addressId;
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
        this.postalCode = postalCode;
        this.postOffice = postOffice;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
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

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", primaryAddress='" + primaryAddress + '\'' +
                ", secondaryAddress='" + secondaryAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", postOffice='" + postOffice + '\'' +
                '}';
    }
}
