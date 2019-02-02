package com.java.youquan.admin.partner.controller;

import com.java.youquan.admin.partner.service.PartnerService;
import com.java.youquan.common.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author xdd
 * @date 2019/2/2
 */
@RequestMapping("partner")
@RestController
@CrossOrigin
public class PartnerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PartnerController.class);

    @Autowired
    private PartnerService partnerService;

    @RequestMapping("insert")
    public Result insert(@RequestBody Map<String, Object> params) {
        LOGGER.info("保存代理品牌参数：{}", params);
        Map<String, Object> res = partnerService.insert(params);
        LOGGER.info("保存代理品牌返回：{}", res);
        return new Result(100, res);
    }

    @RequestMapping("update")
    public Result update(@RequestBody Map<String, Object> params) {
        LOGGER.info("更新代理品牌参数：{}", params);
        int res = partnerService.update(params);
        LOGGER.info("更新代理品牌返回：{}", res);
        return new Result(100, res);
    }
    @RequestMapping("listByPartner")
    public Result listByPartner(@RequestBody Map<String, Object> params) {
        LOGGER.info("查询代理品牌参数：{}", params);
        List<Map<String, Object>> res = partnerService.listByPartner(params);
        LOGGER.info("查询代理品牌返回：{}", res);
        return new Result(100, res);
    }

}
