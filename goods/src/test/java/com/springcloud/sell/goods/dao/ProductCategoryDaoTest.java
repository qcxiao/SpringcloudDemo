package com.springcloud.sell.goods.dao;

import com.springcloud.sell.goods.GoodsApplicationTests;
import com.springcloud.sell.goods.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: yaodao
 * @Date: 2018/6/3 22:25
 */
@Component
public class ProductCategoryDaoTest extends GoodsApplicationTests {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> productCategoryList =  productCategoryDao.findByCategoryTypeIn(Arrays.asList(11, 12));
        Assert.assertTrue(productCategoryList.size() > 0);
    }

}