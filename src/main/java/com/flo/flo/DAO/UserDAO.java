package com.flo.flo.DAO;

import com.flo.flo.models.Users;

import java.util.List;

public interface UserDAO {
    List<Users> allUser();
    void add_us(Users user);
    void delete_us(Users user);
    void edit_us(Users user);
    Users getById_us(int id);
}
