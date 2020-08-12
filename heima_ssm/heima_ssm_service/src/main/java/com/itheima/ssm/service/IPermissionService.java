package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/9 17:03
 */
public interface IPermissionService {

    // 查询所有资源权限
    List<Permission> findAll(int page,int size) throws Exception;

    // 添加资源权限
    void save(Permission permission);
}
