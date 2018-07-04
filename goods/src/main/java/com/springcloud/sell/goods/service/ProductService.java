package com.springcloud.sell.goods.service;

import com.springcloud.sell.goods.entity.ProductInfo;

import java.util.List;

/**
 * @Author: yaodao
 * @Date: 2018/6/3 22:32
 */
public interface ProductService {
    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();
}
