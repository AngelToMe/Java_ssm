package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/9 11:41
 */
public interface IRoleDao {

    // 通过用户ID查询对应的角色
    @Select("select * from role where id in(select roleId from users_role where userId=#{userId})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "com.itheima.ssm.dao.IPermissionDao.findPermissionByRoleId")),
    })
    public List<Role> findRoleByUserId(String userId) throws Exception;

    // 查询所有角色
    @Select("select * from role")
    List<Role> findAll();

    // 新增角色信息
    @Insert("insert into role(Rolename,Roledesc) values(#{roleName},#{roleDesc})")
    void save(Role role);

    // 根据roleId查询role
    @Select("select * from role where id=#{roleId}")
    Role findById(String roleId);

    // 根据roleId查询所有未拥有的资源权限
    @Select("select * from permission where id not in (select permissionId from role_permission where roleId=#{roleId})")
    List<Permission> findOtherPermissions(String roleId);

    // 添加资源权限
    @Insert("insert into role_permission values(#{permission},#{roleId})")
    void addPermissionToRole(@Param("roleId") String roleId,@Param("permission") String permission);
}
