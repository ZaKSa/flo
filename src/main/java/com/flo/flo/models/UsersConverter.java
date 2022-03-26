package com.flo.flo.models;

import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId_us(usersDto.getId_us());
        users.setEmail_us(usersDto.getEmail_us());
        users.setName_us(usersDto.getName_us());
        return users;
    }

    public UsersDto fromUserToUserDto(Users users) {

        UsersDto usersDto = new UsersDto();
        usersDto.setId_us(users.getId_us());
        usersDto.setEmail_us(users.getEmail_us());
        usersDto.setName_us(users.getName_us());
        return usersDto;
    }

}