package com.flo.flo.DAO;

import com.flo.flo.models.Users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserDAOimplement implements UserDAO{

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Users> users = new HashMap<>();

    static {
        Users user1 = new Users();
        user1.setId_us(AUTO_ID.getAndIncrement());
        user1.setName_us("User");
        user1.setSurname_us("Userov");
        user1.setGender_us("m");
        user1.setPhone_number_us("87777777777");
        user1.setEmail_us("email1");
        user1.setPassword_us("qwerty12345");
        user1.setHeight(180.0);
        user1.setWight(61.0);

        //user1.setBday(2008.05.30);

        user1.setPrivilege(false);
        user1.setId_pl(AUTO_ID.getAndIncrement());

        users.put(Math.toIntExact(user1.getId_us()), user1);

    }

    @Override
    public List<Users> allUser() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void add_us(Users user) {
        user.setId_us(AUTO_ID.getAndIncrement());
        users.put(user.getId_us(), user);
    }

    @Override
    public void delete_us(Users user) {
        users.remove(user.getId_us());
    }

    @Override
    public void edit_us(Users user) {
        users.put(user.getId_us(), user);
    }

    @Override
    public Users getById_us(int id) {
        return users.get(id);
    }
}
