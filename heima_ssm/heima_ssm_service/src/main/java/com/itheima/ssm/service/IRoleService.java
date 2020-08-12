package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/9 16:44
 */
public interface IRoleService {

    // 查询所有角色信息
    List<Role> findAll(int page,int size) throws Exception;

    // 新增数据
    void save(Role role);

    // 根据roleId查询role
    Role findById(String roleId) throws Exception;

    // 根据roleId查询可以添加的权限
    List<Permission> findOtherPermissions(String roleId) throws Exception;

    // 添加资源权限
    void addPermissionToRole(String roleId, String[] permissions);
}
