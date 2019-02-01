package com.java.youquan.admin.product.service;

import java.util.List;
import java.util.Map; /**
 * @author xdd
 * @date 2019/2/1
 */
public interface ProductService {
    Map<String,Object> insert(Map<String, Object> params);

    Map<String,Object> insertCategory(Map<String, Object> params);

    List<Map<String,Object>> listByProduct(Map<String, Object> params);

    int updateProduct(Map<String, Object> params);

    int updateProductCategory(Map<String, Object> params);
}
