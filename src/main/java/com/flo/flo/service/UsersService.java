package com.flo.flo.service;

import com.flo.flo.models.UsersDto;

import javax.xml.bind.ValidationException;
import java.util.List;

public interface UsersService {

    UsersDto saveUser(UsersDto usersDto) throws ValidationException;

    void validateUserDto(UsersDto usersDto) throws ValidationException;

    void deleteUser(Integer userId);

    UsersDto findByEmail_us(String email);

    List<UsersDto> findAll();
}