package com.java.youquan.admin.partner.service;

import java.util.List;
import java.util.Map; /**
 * @author xdd
 * @date 2019/2/2
 */
public interface PartnerService {
    Map<String,Object> insert(Map<String, Object> params);

    int update(Map<String, Object> params);

    List<Map<String, Object>> listByPartner(Map<String, Object> params);
}
