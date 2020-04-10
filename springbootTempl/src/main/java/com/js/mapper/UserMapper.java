package com.js.mapper;

import com.js.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by j1076 on 2020/3/15.
 */
@Repository
public interface UserMapper {
    void addUser(User user);
}
