package com.flo.flo.DAO;

import com.flo.flo.models.UsersDto;

import java.util.List;

public interface UsersDtoDAO {
    List<UsersDto> allUserDto();
    void add_ud(UsersDto userD);
    void delete_ud(UsersDto userD);
    void edit_ud(UsersDto userD);
    UsersDto getById_ud(int id);
}
