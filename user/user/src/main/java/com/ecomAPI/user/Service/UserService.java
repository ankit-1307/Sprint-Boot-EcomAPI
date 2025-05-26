package com.ecomAPI.user.Service;

import com.ecomAPI.user.DTO.UserDTO;
import com.ecomAPI.user.Modal.User;
import com.ecomAPI.user.Repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceImpl {

    @Autowired
    private UserRepository repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = mapper.map(userDTO, User.class);
        User savedUser = repo.save(user);

        return mapper.map(savedUser, UserDTO.class);
    }

    @Override
    public List<UserDTO> findAllUser() {
        List<User> users = repo.findAll();
        System.out.println(users);
        return users.stream().map(user -> mapper.map(user, UserDTO.class)).toList();
    }

    @Override
    public UserDTO getUser(Long id) {
        User user = repo.findById(id).orElseThrow(RuntimeException::new);
        return mapper.map(user, UserDTO.class);
    }
}
