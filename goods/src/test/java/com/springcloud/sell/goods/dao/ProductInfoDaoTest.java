package com.springcloud.sell.goods.dao;

import com.netflix.discovery.converters.Auto;
import com.springcloud.sell.goods.GoodsApplicationTests;
import com.springcloud.sell.goods.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: yaodao
 * @Date: 2018/6/3 22:08
 */
@Component
public class ProductInfoDaoTest extends GoodsApplicationTests {

    @Autowired
    private ProductInfoDao productInfoDao;
    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = productInfoDao.findByProductStatus(0);
        Assert.assertTrue(productInfoList != null);
    }

}