package com.desafiopicpay.dtos;

import com.desafiopicpay.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO (UserType userType, String firstName, String lastName, String document, String email, String password, BigDecimal balance) {


}
