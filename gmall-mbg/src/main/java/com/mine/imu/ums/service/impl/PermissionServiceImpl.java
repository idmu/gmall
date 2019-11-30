package com.mine.imu.ums.service.impl;

import com.mine.imu.ums.entity.Permission;
import com.mine.imu.ums.mapper.PermissionMapper;
import com.mine.imu.ums.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
