package com.flo.flo.DAO;

import com.flo.flo.models.UsersDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UsersDtoDAOimplement implements UsersDtoDAO{

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, UsersDto> usersD = new HashMap<>();

    static {
        UsersDto userD1 = new UsersDto();
        userD1.setId_us(AUTO_ID.getAndIncrement());
        userD1.setName_us("User");
        userD1.setSurname_us("Userov");
        userD1.setGender_us("m");
        userD1.setPhone_number_us("87777777777");
        userD1.setEmail_us("email1");
        //userD1.setPassword_us("qwerty12345");
        userD1.setHeight(180.0);
        userD1.setWight(61.0);

        //user1.setBday(2008-05-30);

        //userD1.setPrivilege(false);
        userD1.setId_pl(AUTO_ID.getAndIncrement());

        usersD.put(Math.toIntExact(userD1.getId_us()), userD1);

    }

    @Override
    public List<UsersDto> allUserDto() {
        return new ArrayList<>(usersD.values());
    }

    @Override
    public void add_ud(UsersDto userD) {
        userD.setId_us(AUTO_ID.getAndIncrement());
        usersD.put(userD.getId_us(), userD);
    }

    @Override
    public void delete_ud(UsersDto userD) {
        usersD.remove(userD.getId_us());
    }

    @Override
    public void edit_ud(UsersDto userD) {
        usersD.put(userD.getId_us(), userD);
    }

    @Override
    public UsersDto getById_ud(int id) {
        return usersD.get(id);
    }
}
