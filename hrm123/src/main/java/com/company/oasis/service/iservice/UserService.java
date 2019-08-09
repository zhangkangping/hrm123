package com.company.oasis.service.iservice;

import com.company.oasis.dao.pojo.User;

public interface UserService {
    String userExist(String username);

    User login(User user);

    String registry(User user);
}
