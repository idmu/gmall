package com.mine.imu.ums.service.impl;

import com.mine.imu.ums.entity.Admin;
import com.mine.imu.ums.mapper.AdminMapper;
import com.mine.imu.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
