package com.ecomAPI.user.DTO;

import com.ecomAPI.user.Modal.Address;
import com.ecomAPI.user.Modal.UserRole;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;
    private Address address;

}
