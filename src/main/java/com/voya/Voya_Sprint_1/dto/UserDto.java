package com.voya.Voya_Sprint_1.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Integer userId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Email
    @NotNull
    private String email;

    @NotNull
    private String networkId;

    @NotNull
    private String userType;

    private String status;

    private LocalDateTime createdAt;

    private String clientLegalName;

    private String planId;

    private String situsState;

    private LocalDateTime effectiveDate;

    private String sicCode;

    private String ein;

    private String legalEntityType;

    private String address;

    private LocalDateTime nextRenewalDate;

    private String maxPrimaryContact;

    private String workPhoneNumber;

    private String workEmailAddress;
}