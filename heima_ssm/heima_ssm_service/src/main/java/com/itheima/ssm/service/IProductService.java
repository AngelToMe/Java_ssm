package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

/**
 * 产品信息业务层
 * @author Vagaband
 * @date 2020/8/7 17:55
 */
public interface IProductService {

    /**
     * 查询所有产品信息
     * @return
     * @throws Exception
     */
    public List<Product> findAll(int page,int size) throws Exception;

    /**
     * 保存产品信息
     * @param product
     */
    void save(Product product);

    /**
     * 删除产品信息
     * @param id
     * @return
     */
    int delete(String[] id);
}
