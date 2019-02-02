package com.java.youquan.admin.partner.mapper;

import java.util.List;
import java.util.Map;

/**
 * @author xdd
 * @date 2019/2/2
 */
public interface PartnerMapper {
    int insert(Map<String, Object> params);

    int updatePartner(Map<String, Object> params);

    List<Map<String, Object>> listByPartner(Map<String, Object> params);
}
