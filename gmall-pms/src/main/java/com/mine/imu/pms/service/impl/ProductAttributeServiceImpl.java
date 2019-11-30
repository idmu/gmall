package com.mine.imu.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mine.imu.pms.entity.ProductAttribute;
import com.mine.imu.pms.mapper.ProductAttributeMapper;
import com.mine.imu.pms.service.ProductAttributeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品属性参数表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeMapper, ProductAttribute> implements ProductAttributeService {

}
