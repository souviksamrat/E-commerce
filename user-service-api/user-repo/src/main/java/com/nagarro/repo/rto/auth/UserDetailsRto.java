package com.nagarro.repo.rto.auth;



import com.nagarro.repo.rto.user.DeliveryAddressRto;
import com.nagarro.repo.rto.user.UserInformationRto;

import javax.persistence.*;

import java.util.List;


@Entity
@Table(name = "User_Details")
public class UserDetailsRto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<DeliveryAddressRto> deliveryAddress;
    @OneToOne
    @JoinColumn(name = "user_information_id")
    private UserInformationRto userInformation;

    public UserDetailsRto() {
    }

    public UserDetailsRto(long userId, List<DeliveryAddressRto> deliveryAddress, UserInformationRto userInformation) {
        this.userId = userId;
        this.deliveryAddress = deliveryAddress;
        this.userInformation = userInformation;
    }

    public long getUserId() {
        return userId;
    }



    public List<DeliveryAddressRto> getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(List<DeliveryAddressRto> deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public UserInformationRto getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformationRto userInformation) {
        this.userInformation = userInformation;
    }

    @Override
    public String toString() {
        return "UserDetailsRto{" +
                "userId=" + userId +
                ", deliveryAddress=" + deliveryAddress +
                ", userInformation=" + userInformation +
                '}';
    }
}

