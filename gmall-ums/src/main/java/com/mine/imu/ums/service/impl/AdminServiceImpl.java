package com.mine.imu.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mine.imu.ums.entity.Admin;
import com.mine.imu.ums.mapper.AdminMapper;
import com.mine.imu.ums.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
 public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {

        String s = DigestUtils.md5DigestAsHex(password.getBytes());

        QueryWrapper<Admin> wrapper = new QueryWrapper<Admin>().eq("username", username).eq("password", s);

        Admin admin = adminMapper.selectOne(wrapper);

        return admin;
    }

    /**
     * 获取用户详情
     * @param userName
     * @return
     */
    @Override
    public Admin getUserInfo(String userName) {
        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username",userName));
    }
}
