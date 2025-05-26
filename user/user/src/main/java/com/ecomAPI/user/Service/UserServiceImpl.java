package com.ecomAPI.user.Service;

import com.ecomAPI.user.DTO.UserDTO;

import java.util.List;

public interface UserServiceImpl {
    UserDTO createUser(UserDTO user);

    List<UserDTO> findAllUser();

    UserDTO getUser(Long id);

}
