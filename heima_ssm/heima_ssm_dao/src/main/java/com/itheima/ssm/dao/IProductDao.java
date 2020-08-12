package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/7 17:53
 */
public interface IProductDao {

    // 根据ID查询产品信息
    @Select("select * from product where id=#{id}")
    Product findById(String id) throws Exception;

    // 查询所有产品信息
    @Select("select * from product")
    List<Product> findAll() throws Exception;

    // 保存产品信息
    @Insert("insert into product(productnum,productname,cityname,departuretime,productprice,productdesc,productstatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);

    // 删除产品信息
    @Delete("delete from product where id=#{id}")
    int delete(String id);
}
