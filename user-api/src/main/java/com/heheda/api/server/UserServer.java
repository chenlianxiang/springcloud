package com.heheda.api.server;

import com.heheda.api.domain.User;

import java.util.List;


public interface UserServer {

    /**
     * 获取所有用户
     * @return
     */
    List<User> getAllUser();

    /**
     * 保存用户
     * @param user
     * @return
     */
    boolean saveUser(User user);
}
