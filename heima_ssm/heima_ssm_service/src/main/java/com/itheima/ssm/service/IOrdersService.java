package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/8 15:45
 */
public interface IOrdersService {

    // 查询所有订单信息
    List<Orders> findAll(int page, int size) throws Exception;

    // 查询订单详情
    Orders findById(String id) throws Exception;
}
