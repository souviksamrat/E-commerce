package com.nagarro.models.auth;

import com.nagarro.models.user.deliveryInformation.DeliveryAddress;
import com.nagarro.models.user.personalInformation.UserInformation;


public class UserDetails {

    private String userId;
    private DeliveryAddress deliveryAddress;
    private UserInformation userInformation;

    public UserDetails() {
    }

    public UserDetails(String userId, DeliveryAddress deliveryAddress, UserInformation userInformation) {
        this.userId = userId;
        this.deliveryAddress = deliveryAddress;
        this.userInformation = userInformation;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId='" + userId + '\'' +
                ", deliveryAddress=" + deliveryAddress +
                ", userInformation=" + userInformation +
                '}';
    }
}
