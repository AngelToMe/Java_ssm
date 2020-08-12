package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/7 17:57
 */
@Service
@Transactional // 事务注释
public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    /**
     * 查询所有产品信息
     * @return
     * @throws Exception
     */
    @Override
    public List<Product> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return productDao.findAll();
    }

    /**
     * 保存产品信息
     * @param product
     */
    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    /**
     * 删除产品信息
     * @param id
     * @return
     */
    @Override
    public int delete(String[] id) {
        int count = 0;
        for (int i = 0; i < id.length; i++) {
            int flag = productDao.delete(id[i]);
            if (flag > 0) {
                count++;
            }
        }
        return count;
    }

}
