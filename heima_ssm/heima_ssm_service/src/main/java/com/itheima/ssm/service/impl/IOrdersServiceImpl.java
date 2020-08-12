package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IOrdersDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/8 15:45
 */
@Service
@Transactional // 开启事务注解
public class IOrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    /**
     * 查询所有订单信息
     * @return
     * @throws Exception
     * @param page
     * @param size
     */
    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        // pageNum 页码值 pageSize 每页显示条数
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }

    /**
     * 查询订单详情
     * @param id
     * @return
     */
    @Override
    public Orders findById(String id) throws Exception {
        return ordersDao.findById(id);
    }
}
