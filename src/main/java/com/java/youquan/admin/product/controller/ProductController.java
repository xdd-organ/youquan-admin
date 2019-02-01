package com.java.youquan.admin.product.controller;

import com.java.youquan.admin.product.service.ProductService;
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
 * @date 2019/2/1
 */
@RequestMapping("product")
@RestController
@CrossOrigin
public class ProductController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping("insert")
    public Result insert(@RequestBody Map<String, Object> params) {
        LOGGER.info("保存产品参数：{}", params);
        Map<String, Object> res = productService.insert(params);
        LOGGER.info("保存产品返回：{}", res);
        return new Result(100, res);
    }

    @RequestMapping("insertCategory")
    public Result insertCategory(@RequestBody Map<String, Object> params) {
        LOGGER.info("保存产品类目参数：{}", params);
        Map<String, Object> res = productService.insertCategory(params);
        LOGGER.info("保存产品类目返回：{}", res);
        return new Result(100, res);
    }

    @RequestMapping("listByProduct")
    public Result listByProduct(@RequestBody Map<String, Object> params) {
        LOGGER.info("查询产品参数：{}", params);
        List<Map<String, Object>> res = productService.listByProduct(params);
        LOGGER.info("查询产品返回：{}", res);
        return new Result(100, res);
    }

    @RequestMapping("updateProduct")
    public Result updateProduct(@RequestBody Map<String, Object> params) {
        LOGGER.info("更新产品参数：{}", params);
        int res = productService.updateProduct(params);
        LOGGER.info("更新产品返回：{}", res);
        return new Result(100, res);
    }

    @RequestMapping("updateProductCategory")
    public Result updateProductCategory(@RequestBody Map<String, Object> params) {
        LOGGER.info("更新产品类目参数：{}", params);
        int res = productService.updateProductCategory(params);
        LOGGER.info("更新产品类目返回：{}", res);
        return new Result(100, res);
    }

}
