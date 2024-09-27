package com.service;

import java.util.List;

import com.dto.UserDto;
import com.entity.User;

public interface UserService {

	void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
