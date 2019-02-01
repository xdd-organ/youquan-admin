package com.java.youquan.admin.product.mapper;

import java.util.List;
import java.util.Map;

/**
 * @author xdd
 * @date 2019/2/1
 */
public interface ProductMapper {

    int insert(Map<String, Object> params);

    int insertCategory(Map<String, Object> params);

    int updateProduct(Map<String, Object> params);

    int updateProductCategory(Map<String, Object> params);

    List<Map<String, Object>> listByProduct(Map<String, Object> params);

    List<Map<String, Object>> listByProductCategory(Map<String, Object> params);
}
