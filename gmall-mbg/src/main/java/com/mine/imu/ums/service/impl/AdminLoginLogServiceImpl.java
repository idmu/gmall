package com.mine.imu.ums.service.impl;

import com.mine.imu.ums.entity.AdminLoginLog;
import com.mine.imu.ums.mapper.AdminLoginLogMapper;
import com.mine.imu.ums.service.AdminLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogMapper, AdminLoginLog> implements AdminLoginLogService {

}
