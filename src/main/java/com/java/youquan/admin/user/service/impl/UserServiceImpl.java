package com.java.youquan.admin.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.java.youquan.admin.user.mapper.UserMapper;
import com.java.youquan.admin.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author xdd
 * @date 2018/8/21
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> insert(Map<String, Object> params) {
        userMapper.insert(params);
        return params;
    }

    @Override
    public Map<String, Object> getByUsername(String username) {
        return userMapper.getByUsername(username);
    }

    @Override
    public Map<String, Object> getByUserId(String userId) {
        Map<String, Object> user = userMapper.getByUserId(userId);
        if (user != null) user.remove("password");
        return user;
    }

    @Override
    public PageInfo pageByUser(Map<String, Object> params) {
        logger.info("分页查询用户参数：{}", params);
        PageHelper.startPage(Integer.valueOf(params.get("pageNum").toString()), Integer.valueOf(params.get("pageSize").toString()));
        PageInfo pageInfo = new PageInfo(userMapper.listByUser(params));
        logger.info("分页查询用户返回：{}", pageInfo);
        return pageInfo;
    }

}
