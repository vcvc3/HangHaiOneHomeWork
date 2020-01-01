package com.lhj.service;

import com.lhj.entities.User;

import java.util.List;
import java.util.Optional;


/**
 * @author Shinelon
 */
public interface UserService {
    /**
     * 查找所有用户
     * @return
     */
    public List<User> findAll();

    /**
     * 通过id查找用户
     * @return
     */
    public Optional<User> findById(Integer id);

    /**
     * 更新用户
     * @param user
     * @return
     */
    public User updateUser(User user);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public User add(User user);

    /**
     * 删除用户
     * @param id
     */
    public void del(Integer id);
}