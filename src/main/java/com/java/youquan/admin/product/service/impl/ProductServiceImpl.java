package com.java.youquan.admin.product.service.impl;

import com.java.youquan.admin.product.mapper.ProductMapper;
import com.java.youquan.admin.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xdd
 * @date 2019/2/1
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Map<String, Object> insert(Map<String, Object> params) {
        productMapper.insert(params);
        return params;
    }

    @Override
    public Map<String, Object> insertCategory(Map<String, Object> params) {
        productMapper.insertCategory(params);
        return params;
    }

    @Override
    public List<Map<String, Object>> listByProduct(Map<String, Object> params) {
        return productMapper.listByProduct(params);
    }

    @Override
    public int updateProduct(Map<String, Object> params) {
        return productMapper.updateProduct(params);
    }

    @Override
    public int updateProductCategory(Map<String, Object> params) {
        return productMapper.updateProductCategory(params);
    }
}
