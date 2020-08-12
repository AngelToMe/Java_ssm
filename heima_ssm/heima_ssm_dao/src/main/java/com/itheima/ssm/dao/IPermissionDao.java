package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/9 15:54
 */
public interface IPermissionDao {

    // 根据roleId查询出资源权限表
    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id})")
    List<Permission> findPermissionByRoleId(String id) throws Exception;

    // 查询所有资源权限
    @Select("select * from permission")
    List<Permission> findAll() throws Exception;

    // 新增资源权限
    @Insert("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission);
}
