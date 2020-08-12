package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/9 9:01
 */
public interface IUserService extends UserDetailsService {

    // 查询所有用户
    List<UserInfo> findAll(int page,int size) throws Exception;

    // 新增用户
    void save(UserInfo userInfo) throws Exception;

    // 根据id查询用户
    UserInfo findById(String id) throws Exception;

    // 查询用户可添加的所有角色
    List<Role> findOtherRole(String userId);

    // 通过userId(用户ID)和roleId(角色ID) 添加角色
    void saveRole(String userId, String[] roleId);

}
