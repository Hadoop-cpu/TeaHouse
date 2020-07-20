package com.qf.service;

import com.qf.pojo.User;
import com.qf.vo.R;

import java.util.List;

/**
 * @ClassName: UserService
 * @Author: 马陈浩
 * @Date: 2020/7/18
 * @Time: 11:23
 */
public interface UserService {
    //修改user信息
    R updateUser(User user);
    //根据id查询用户信息
    R selectUserById(Integer user_id);
}
