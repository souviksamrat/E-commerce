package com.nagarro.repo.transformer.user;

import com.nagarro.models.user.deliveryInformation.DeliveryAddress;
import com.nagarro.repo.rto.user.DeliveryAddressRto;

import java.util.function.Function;

public class DeliveryAddressRtoTransformer implements Function<DeliveryAddress,DeliveryAddressRto> {

    @Override
    public DeliveryAddressRto apply(DeliveryAddress deliveryAddress) {
        return null;
    }
}
