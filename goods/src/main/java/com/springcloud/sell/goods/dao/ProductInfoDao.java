package com.springcloud.sell.goods.dao;

import com.springcloud.sell.goods.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: yaodao
 * @Date: 2018/6/3 22:04
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
