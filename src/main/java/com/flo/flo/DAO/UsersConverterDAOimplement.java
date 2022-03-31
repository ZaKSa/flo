package com.flo.flo.DAO;

import com.flo.flo.models.Users;
import com.flo.flo.models.UsersConverter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UsersConverterDAOimplement implements UsersConverterDAO{
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, UsersConverter> usersC = new HashMap<>();

    static {
        UsersConverter userC1 = new UsersConverter();



        //usersC.put(Math.toIntExact(userC1.getId_us()), userC1);

    }


    @Override
    public List<UsersConverter> allUserConverter() {
        return null;
    }

    @Override
    public void add_uc(UsersConverter userC) {

    }

    @Override
    public void delete_uc(UsersConverter userC) {

    }

    @Override
    public void edit_uc(UsersConverter userC) {

    }

    @Override
    public UsersConverter getById_uc(int id) {
        return null;
    }
}
