package com.mine.imu.ums.service.impl;

import com.mine.imu.ums.entity.AdminPermissionRelation;
import com.mine.imu.ums.mapper.AdminPermissionRelationMapper;
import com.mine.imu.ums.service.AdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationMapper, AdminPermissionRelation> implements AdminPermissionRelationService {

}
