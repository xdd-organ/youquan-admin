package com.java.youquan.admin.partner.service.impl;

import com.java.youquan.admin.partner.mapper.PartnerMapper;
import com.java.youquan.admin.partner.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author xdd
 * @date 2019/2/2
 */
@Service
public class PartnerServiceImpl implements PartnerService {

    @Autowired
    private PartnerMapper partnerMapper;

    @Override
    public Map<String, Object> insert(Map<String, Object> params) {
        partnerMapper.insert(params);
        return params;
    }

    @Override
    public int update(Map<String, Object> params) {
        return partnerMapper.updatePartner(params);
    }

    @Override
    public List<Map<String, Object>> listByPartner(Map<String, Object> params) {
        return partnerMapper.listByPartner(params);
    }
}
