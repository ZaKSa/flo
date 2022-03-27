package com.flo.flo.models;

import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId_us(usersDto.getId_us());
        users.setEmail_us(usersDto.getEmail_us());
        users.setName_us(usersDto.getName_us());
        users.setSurname_us(usersDto.getSurname_us());
        users.setGender_us(usersDto.getGender_us());
        users.setPhone_number_us(usersDto.getPhone_number_us());
        users.setHeight(usersDto.getHeight());
        users.setWight(usersDto.getWight());
        users.setBday(usersDto.getBday());
        users.setId_pl(usersDto.getId_pl());
        users.setId(usersDto.getId());
        return users;
    }

    public UsersDto fromUserToUserDto(Users users) {
        UsersDto usersDto = new UsersDto();
        usersDto.setId_us(users.getId_us());
        usersDto.setEmail_us(users.getEmail_us());
        usersDto.setName_us(users.getName_us());
        usersDto.setSurname_us(users.getSurname_us());
        usersDto.setGender_us(users.getGender_us());
        usersDto.setPhone_number_us(users.getPhone_number_us());
        usersDto.setHeight(users.getHeight());
        usersDto.setWight(users.getWight());
        usersDto.setBday(users.getBday());
        usersDto.setId_pl(users.getId_pl());
        usersDto.setId(users.getId());
        return usersDto;
    }

}