package com.example.pds.model.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserProfileChangeDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}