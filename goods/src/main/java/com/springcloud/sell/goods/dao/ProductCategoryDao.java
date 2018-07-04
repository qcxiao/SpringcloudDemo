package com.springcloud.sell.goods.dao;

import com.springcloud.sell.goods.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: yaodao
 * @Date: 2018/6/3 22:22
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
