package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IRoleDao;
import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;
import com.itheima.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/9 16:44
 */
@Service
@Transactional
public class IRoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;

    /**
     * 查询所有角色
     * @return
     */
    @Override
    public List<Role> findAll(int page,int size) {
        PageHelper.startPage(page,size);
        return roleDao.findAll();
    }

    /**
     * 新增角色
     * @param role
     * @return
     */
    @Override
    public void save(Role role) {
        roleDao.save(role);
    }

    /**
     * 根据roleId查询role
     * @param roleId
     * @return
     */
    @Override
    public Role findById(String roleId) {
        return roleDao.findById(roleId);
    }

    /**
     * 根据roleId查询可以添加的权限
     * @param roleId
     * @return
     */
    @Override
    public List<Permission> findOtherPermissions(String roleId) {
        return roleDao.findOtherPermissions(roleId);
    }

    /**
     * 添加资源权限
     * @param roleId
     * @param permissions
     */
    @Override
    public void addPermissionToRole(String roleId, String[] permissions) {
        for (String permission:permissions){
            roleDao.addPermissionToRole(roleId,permission);
        }
    }


}
