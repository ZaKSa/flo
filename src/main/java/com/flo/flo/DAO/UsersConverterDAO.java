package com.flo.flo.DAO;

import com.flo.flo.models.UsersConverter;

import java.util.List;

public interface UsersConverterDAO {
    List<UsersConverter> allUserConverter();
    void add_uc(UsersConverter userC);
    void delete_uc(UsersConverter userC);
    void edit_uc(UsersConverter userC);
    UsersConverter getById_uc(int id);
}
