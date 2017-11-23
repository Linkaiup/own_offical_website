package com.linkai.dao;

import com.linkai.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by K Lin
 * on 2017/11/23.
 * at 18:15
 * description : offical_website
 */
@Mapper
@Repository
public interface ProductDao {
    /**
     *展示日期对应项目
     * @param buildtime 建成时间
     * @return List<Product> 对应产品列表
     */
    List<Product> showProduct(@Param("buildtime")String buildtime);

    /**
     * 添加项目
     * @param product
     * @return
     */
    int addProduct(@Param("product")Product product);

    /**
     * 删除项目
     * @param productid
     * @return
     */
    int deleteProduct(@Param("productid")int productid);

    /**
     * 更新项目
     * @param product
     * @return
     */
    int updateProduct(@Param("product")Product product);

}
