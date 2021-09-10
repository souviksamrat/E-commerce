package com.nagarro.repo.rto.user;


import com.nagarro.repo.rto.auth.UserDetailsRto;

import javax.persistence.*;

@Entity
@Table(name = "Delivery_Address")
public class DeliveryAddressRto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deliveryAddressId;
    private String personName;
    private String phoneNumber;
    private String pincode;
    private String locality;
    private String city;
    private String state;
    private String landMark;
    private String alternativePhoneNUmber;
    private AddressType addressType;

    public DeliveryAddressRto() {
    }

    public DeliveryAddressRto(long deliveryAddressId, String personName, String phoneNumber, String pincode, String locality, String city, String state, String landMark, String alternativePhoneNUmber, AddressType addressType) {
        this.deliveryAddressId = deliveryAddressId;
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.pincode = pincode;
        this.locality = locality;
        this.city = city;
        this.state = state;
        this.landMark = landMark;
        this.alternativePhoneNUmber = alternativePhoneNUmber;
        this.addressType = addressType;
    }

    public long getDeliveryAddressId() {
        return deliveryAddressId;
    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getAlternativePhoneNUmber() {
        return alternativePhoneNUmber;
    }

    public void setAlternativePhoneNUmber(String alternativePhoneNUmber) {
        this.alternativePhoneNUmber = alternativePhoneNUmber;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "DeliveryAddressRto{" +
                "deliveryAddressId=" + deliveryAddressId +
                ", personName='" + personName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pincode='" + pincode + '\'' +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", landMark='" + landMark + '\'' +
                ", alternativePhoneNUmber='" + alternativePhoneNUmber + '\'' +
                ", addressType=" + addressType +
                '}';
    }
}
